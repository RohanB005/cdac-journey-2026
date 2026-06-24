package com.bookstore.BookStoreApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.BookStoreApplication.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	private final BookService bookService;
	private final String welcomeUser;
	
	public BookController(BookService bookService, String welcomeUser) {
		this.bookService = bookService;
		this.welcomeUser = welcomeUser;
	}
	@GetMapping("/welcome")
	public String showWelcome() {
		return welcomeUser;
	}

	@GetMapping()
	public String listBooks() {
		return bookService.fetchAllBooks();
	}
	
	@PostMapping("/order")
	public String orderBook(@RequestParam String bookName) {
		return bookService.orderBook(bookName);
	}
}
