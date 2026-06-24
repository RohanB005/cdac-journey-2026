package com.demo.atm.service;


public interface ATMService {
	double checkBalance();
	String deposit(double amount);
	String withdraw(double amount);

}
