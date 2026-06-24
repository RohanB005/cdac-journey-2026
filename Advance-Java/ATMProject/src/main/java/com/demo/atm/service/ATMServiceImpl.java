package com.demo.atm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.atm.model.Account;
import com.demo.atm.repository.ATMRepository;

@Service
public class ATMServiceImpl implements ATMService{
	@Autowired
	private ATMRepository repository;
	
	@Override
	public double checkBalance() {
		return repository.getAccount().getBalance();
	}
	@Override
	public String deposit(double amount) {
		Account acc = repository.getAccount();
		acc.setBalance(acc.getBalance() + amount);
		repository.updateBalance(acc.getBalance());
		return "Deposit Successful";
	}
	
	@Override
	public String withdraw(double amount) {
		Account acc = repository.getAccount();
		if(acc.getBalance() <= amount) {
			acc.setBalance(acc.getBalance() - amount);
			repository.updateBalance(acc.getBalance());
			return "Withdrawn Successful";
		}
		return "Insufficient Balance";
	}
	

}
