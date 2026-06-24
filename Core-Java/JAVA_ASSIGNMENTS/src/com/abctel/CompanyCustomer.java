package com.abctel;

import java.util.*;

public class CompanyCustomer extends Customer{
	private String relationShipManager;
	private double creditLine;
	private int extensions;
	private List<String> numbers;
	
	public CompanyCustomer(int id, String name, String email, String creditClass, double discount, String plan, String relationShipManager, double creditLine, int extensions, List<String> numbers) {
		super(id, name, email, creditClass, discount, plan);
		this.relationShipManager = relationShipManager;
		this.creditLine = creditLine;
		this.extensions = extensions;
		this.numbers = numbers;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Relationship Manager: " + relationShipManager);
		System.out.println("Credit Line: " + creditLine);
		System.out.println("Extensions: " + extensions);
		System.out.println("Numbers: " + numbers);
		
	}

}
