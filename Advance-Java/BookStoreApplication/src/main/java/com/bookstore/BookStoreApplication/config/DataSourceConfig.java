package com.bookstore.BookStoreApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {
	@Bean
	@Profile("dev")
	public String devDataSource() {
		return "Connected to DEV DB";
	}
	@Bean
	@Profile("stage")
	public String stageDataSource() {
		return "Connected to Stage DB";
	}
	
	@Bean
	@Profile("prod")
	public String prodDataSource() {
		return "Connected to Prod DB";
	}
	
}
