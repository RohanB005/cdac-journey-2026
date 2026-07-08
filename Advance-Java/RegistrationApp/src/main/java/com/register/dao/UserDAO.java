package com.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.register.model.User;
import com.register.util.DBConnection;

public class UserDAO {
	
	public boolean registerUser(User user) {
		boolean status = false;
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "INSERT INTO Users(Name, Email, Password) VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				status = true;
			}
			ps.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
