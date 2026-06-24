package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Bike;
import com.demo.model.Car;

public class TestVehicle {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Car car = new Car(101, "BMW", 5);
		Bike bike = new Bike(201, "KTM", 45);
		
		session.persist(car);
		session.persist(bike);
		tr.commit();
		session.close();
		sf.close();
		System.out.println("Data inserted successfully");
	}

}
