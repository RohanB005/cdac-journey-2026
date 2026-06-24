package com.demo2.sports;

abstract class Employee extends Person{
	protected String dept, designation, doj;
	
	public Employee(int id, String name, String mobile, String email, String dept, String designation, String doj) {
		super(id, name, mobile, email);
		this.dept = dept;
		this.designation = designation;
		this.doj = doj;
	}
	
	public abstract double calculateSalary();
	
	public String getDesignation() {return designation;}
	public String getDept() {return dept;}
}
