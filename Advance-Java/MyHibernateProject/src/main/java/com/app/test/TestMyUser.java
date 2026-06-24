package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.MyUser;

public class TestMyUser {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		MyUser u1 = new MyUser(11, "Sangeeta", "222222", "dd@gmail.com");
		MyUser u2 = new MyUser(12, "Kedar", "333333", "aa@gamil.com");
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(u1);
		session.save(u2);
		tr.commit();
		session.close();
	}

}
