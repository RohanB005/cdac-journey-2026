package com.demo2.sports;

public class Person {
	protected int id;
	protected String name, mobile, email;
	
	public Person(int id, String name, String mobile, String email) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	
	public String toString() {
		return id + " " + name + " " + mobile + " " + email;
	}
}
