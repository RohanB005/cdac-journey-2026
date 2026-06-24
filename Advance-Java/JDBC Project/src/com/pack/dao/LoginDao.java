package com.pack.dao;

import com.pack.model.Product;

public interface LoginDao {
	String authenticateUser(String uname, String passwd);
	void closeMyConnection();
}
