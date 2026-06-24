package com.abctel;

import java.util.*;

public class Vendor extends Person{
	private String phone;
	private List<String> products;
	
	public Vendor(int id, String name, String email, String phone, List<String> products) {
		super(id, name, email);
		this.phone = phone;
		this.products = products;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Phone: " + phone);
		System.out.println("Products: " + products);
	}
}
