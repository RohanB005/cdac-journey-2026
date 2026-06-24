package com.demo2.sports;

public class ContractEmployee extends Employee {
	int hours;
	double rate;
	
	public ContractEmployee(int id, String name, String mobile, String email, String dept, String designation, String doj, int hours, double rate) {
		super(id, name, mobile, email, dept, designation, doj);
		this.hours = hours;
		this.rate = rate;
	}
	
	public double calculateSalary() {
		return hours * rate;
	}
	
	public String toString() {
		return super.toString() + " Contract Salary = " + calculateSalary();
	}

}
