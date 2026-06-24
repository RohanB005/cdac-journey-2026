package com.demo.atm.model;

public class Account {
	private int accountNo;
	private String holderName;
	private double balance;
	public Account() {
		
	}
	public Account(int accountNo, String holderName, double balance) {
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
