package com.bookstore.BookStoreApplication.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	@Qualifier("devDataSource")
	public String devDataSource() {
		return "Development DB";
	}
	
	@Bean
	public String welcomeUser() {
		return "Hello Welcome to Bookstore";
	}
	

}
