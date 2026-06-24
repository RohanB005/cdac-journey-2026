package com.abctel;

public abstract class Customer extends Person{
	protected String creditClass;
	protected double discount;
	protected String plan;
	
	public Customer(int id, String name, String email, String creditClass, double discount, String plan) {
		super(id, name, email);
		this.creditClass = creditClass;
		this.discount = discount;
		this.plan = plan;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Credit Class: " + creditClass);
		System.out.println("Discount: " + discount);
		System.out.println("Plan: " + plan);
	}

}
