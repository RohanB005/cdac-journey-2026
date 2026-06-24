package com.bookstore.BookStoreApplication.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public String findAllBooks() {
		return "Book1, Book2, Book3";
	}
	
	public void saveOrder(String bookName) {
		System.out.println("Order saved for book:" + bookName);
	}

}
