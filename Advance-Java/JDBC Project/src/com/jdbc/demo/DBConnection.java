package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/college";
		
		String username = "root";
		
		String password = "Root@123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, 
					username, 
					password);
			
			System.out.println("Database Connected Successfully");
			
			Statement st = con.createStatement();
			
			String query = 
					"CREATE TABLE student("
					 + "id INT PRIMARY KEY, "
					 + "name VARCHAR(50), "
					 + "marks INT) ";
			
			st.executeUpdate(query);
			
			System.out.println("Table created successfully");
			
			st.close();
			con.close();
			
			System.out.println("Connection closed");
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
