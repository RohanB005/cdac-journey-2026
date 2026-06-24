package com.demo.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class TestCriteriaQueryProduct {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		List<Product> plist = session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		cq.select(root).where(cb.gt(root.get("price"), 180));
		plist = session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		cq.select(root).where(cb.between(root.get("qty"), 8, 20));
		plist = session.createQuery(cq).getResultList();
		plist.forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		Predicate p1 = cb.gt(root.get("price", 200));
		Predicate p2 = cb.lt(root.get("qty"), 25);
		cq.select(root).where(cb.or(p1,p2));
		

	}

}
