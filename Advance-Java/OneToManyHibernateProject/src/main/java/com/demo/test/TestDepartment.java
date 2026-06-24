package com.demo.test;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestDepartment {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1 = new Employee(101, "Rohan");
		Employee e2 = new Employee(102, "Mohini");
		Employee e3 = new Employee(103, "Soham");
		
		Department d = new Department(1, "IT", Arrays.asList(e1, e2, e3));
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		session.persist(d);
		
		System.out.println("Data Inserted.");
	}

}
