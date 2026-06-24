package com.bookstore.BookStoreApplication.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
	
	@Async
	public void sendEmail(String bookName) {
		System.out.println("Order Confirmed for book:" + bookName);
	}
}
