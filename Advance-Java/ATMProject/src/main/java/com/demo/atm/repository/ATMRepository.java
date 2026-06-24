package com.demo.atm.repository;

import org.springframework.stereotype.Repository;

import com.demo.atm.model.Account;

@Repository
public class ATMRepository {
	Account account = new Account(101, "Rohan", 500000);

	public Account getAccount() {
		return account;
	}

	public void updateBalance(double balance) {
		account.setBalance(balance);
	}
	

}
