package com.app.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.app.model.MyUser;
import com.app.util.HibernateUtil;

public class MyUserDAO {
	
	public void saveUser(MyUser user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		System.out.println("User saved successfully");
	}

}
