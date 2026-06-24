package com.abctel;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendor v = new Vendor(1, "ABC Supplies", "abc@gmail.com", "9665433589", Arrays.asList("SIM Cards", "Routers"));
		
		IndividualCustomer ic = new IndividualCustomer(101, "Rohit", "rohit@gmail.com", "A", 10.5, "Prepaid", "9881915178");
		
		CompanyCustomer c = new CompanyCustomer(201, "TechCorp", "corp@gmail.com", "B", 15.0, "Postpaid", "Mr. Sharma", 500000, 50, Arrays.asList("8888888888", "8888888888"));
		
		System.out.println("\n---Vendor---");
		v.display();
		
		System.out.println("\n---Individual Customer---");
		ic.display();
		
		System.out.println("\n---Company Customer---");
		c.display();
	}

}
