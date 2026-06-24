package com.abctel;

public class IndividualCustomer extends Customer {
	private String phone;
	
	public IndividualCustomer(int id, String name, String email, String creditClass, double discount, String plan, String phone) {
		super(id, name, email, creditClass, discount, plan);
		this.phone = phone;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Phone: " + phone);
	}
}
