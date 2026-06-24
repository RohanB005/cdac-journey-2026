package com.demo2.sports;

public class Member extends Person {
	String type;
	double amountPaid;
	
	public Member(int id, String name, String mobile, String email, String dept, String designation, String doj, String type, double amountPaid) {
		super(id, name, mobile, email);
		this.type = type;
		this.amountPaid = amountPaid;
	}

}
