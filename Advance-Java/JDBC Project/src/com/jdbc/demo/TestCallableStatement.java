package com.jdbc.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TestCallableStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/college?useSSL=false&allowPublicKeyRetrieval=true";
			
			Connection con = DriverManager.getConnection(url, "root", "Root@123");
			
			if(con != null) {
				System.out.println("Connection done");
			}else {
				System.out.println("Connection not done");
			}
			int num = 20;
			CallableStatement cst = con.prepareCall("{call getcnt(?,?)}");
			cst.setInt(1, num);
			cst.registerOutParameter(2, Types.INTEGER);
			cst.execute();
			System.out.println("Count in dept" + num + "----> " + cst.getInt(2));
			con.close();
			
		}catch(SQLException e) {
			System.out.println("Connection not done");
			e.printStackTrace();
		}
	}

}
