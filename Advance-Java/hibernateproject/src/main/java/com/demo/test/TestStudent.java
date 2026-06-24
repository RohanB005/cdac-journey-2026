package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Student;

public class TestStudent {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address addr = new Address(111, "Aundh", "Pune", "Maharashtra");
		Student s = new Student(11, "Rohan", "44444", addr);
		Student s1 = new Student(131, "Rohit", "3333", addr);
		session.persist(s1);
		session.persist(s);
		tr.commit();
		session.close();
		Session session1 = sf.openSession();
		Transaction trl = session1.beginTransaction();
		Student s2 = session1.find(Student.class, 11);
		System.out.println(s2);
		trl.commit();
		session1.close();
		sf.close();
	}
	

}
