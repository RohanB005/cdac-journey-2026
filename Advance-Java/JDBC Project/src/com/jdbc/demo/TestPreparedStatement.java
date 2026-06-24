package com.jdbc.demo; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class TestPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/college?useSSL=false&allowPublicKeyRetrieval=true";
			
			Connection con = DriverManager.getConnection(url, "root", "Root@123");
			
			PreparedStatement pst = con.prepareStatement("SELECT * FROM product");
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("Qty: " + rs.getInt(3));
				System.out.println("Price: " + rs.getDouble(4));
				
				LocalDate ldt = rs.getDate(5).toLocalDate();
				
				System.out.println("Mfg Date: " + ldt.toString());
			}
			int id = 23;
			String name = "Rohan";
			int qty = 44;
			double price = 4567.89;
			LocalDate ldt = LocalDate.now();
			PreparedStatement pst1 = con.prepareStatement("INSERT INTO product values(?,?,?,?,?)");
			pst1.setInt(1, id);
			pst1.setString(2, name);
			pst1.setInt(3, qty);
			pst1.setDouble(4, price);
			pst1.setDate(5, java.sql.Date.valueOf(ldt));
			int n = pst1.executeUpdate();
			if(n>0) {
				System.out.println("Insertion done");
			}else {
				System.out.println("Insertion Not done");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
