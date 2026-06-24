package com.demo.atm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.atm.service.ATMService;

@RestController
@RequestMapping("/atm")
public class ATMController {
	@Autowired
	private ATMService service;
	
	@GetMapping("/balance")
	public double balance() {
		return service.checkBalance();
	}
	
	@GetMapping("/deposit/{amount}")
	public String deposit(
			@PathVariable double amount) {
		return service.deposit(amount);
	}
	
	@GetMapping("/withdraw/{amount}")
	public String withdraw(
			@PathVariable double amount) {
		return service.withdraw(amount);
	}
	

}
