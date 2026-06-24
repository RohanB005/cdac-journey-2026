package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.MyUser;
import com.demo.utility.DBUtil;

public class LoginDaoImpl implements LoginDao {
	static Connection con;
	static {
		con = DBUtil.getMyConnection();
	}
	@Override
	public MyUser authenticateUser(String uname, String passwd) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from myuser where uname=? and passwd=?");
			pst.setString(1, uname);
			pst.setString(2, passwd);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new MyUser(rs.getString(1), rs.getString(2), rs.getString(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
		
}
