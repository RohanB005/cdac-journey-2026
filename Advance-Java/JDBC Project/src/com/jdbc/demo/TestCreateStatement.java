package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;


public class TestCreateStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true";
			
			Connection con = DriverManager.getConnection(url, "root", "Root@123");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM product");
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				
				System.out.println("Qty: " + rs.getInt(3));
				System.out.println("Price: " + rs.getDouble(4));
				
				java.sql.Date dt = rs.getDate(5);
				LocalDate ldt = dt.toLocalDate();
				System.out.println("MFG Date: " + ldt.toString());
				System.out.println("------------------------------");
				
			}
			int id = 11;
			String name = "Rohan";
			int qty = 45;
			double price = 456.56;
			LocalDate dt = LocalDate.now();
			String query = "INSERT INTO product values("+id+", '"+name+"', "+qty+", "+price+", '"+dt.toString()+"')"; 
			System.out.println(query);
			int n = st.executeUpdate(query);
			if(n > 0) {
				System.out.println("Insertion done");
			}else {
				System.out.println("Insertion Not done");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
