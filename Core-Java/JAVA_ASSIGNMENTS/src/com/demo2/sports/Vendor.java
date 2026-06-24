package com.demo2.sports;

public class Vendor extends Employee {
	double amount;
	
	public Vendor(int id, String name, String mobile, String email, String dept, String designation, String doj, double amount) {
		super(id, name, mobile, email,  dept, designation, doj);
		this.amount = amount;
	}
	
	public double calculateSalary() {
		return amount + amount * 0.18;
	}
	
	public String toString() {
		return super.toString() + " Vendor Payment = " + calculateSalary();
	}

}
