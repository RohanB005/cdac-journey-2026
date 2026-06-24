package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Laptop;
import com.demo.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Laptop laptop = new Laptop(101, "HP");
		Student student = new Student(1, "Rohan", laptop);
		
		session.persist(student);
		session.persist(laptop);
		tr.commit();
		session.close();
		sf.close();
		System.out.println("Data Inserted Successfully");
	}

}
