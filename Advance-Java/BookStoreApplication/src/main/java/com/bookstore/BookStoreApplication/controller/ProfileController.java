package com.bookstore.BookStoreApplication.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	private final String dataSource;
	
	public ProfileController(@Qualifier("devDataSource")String dataSource) {
		this.dataSource = dataSource;
		
	}
	
	@GetMapping("/profile")
	public String showActiveProfile() {
		return "Current Active Profile:" + dataSource;
	}

}
