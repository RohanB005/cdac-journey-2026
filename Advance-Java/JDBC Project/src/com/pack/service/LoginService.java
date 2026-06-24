package com.pack.service;

public interface LoginService {
	String validateUser(String uname, String passwd);
	void closeMyConnection();
}
