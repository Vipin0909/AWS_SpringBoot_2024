package com.example.AWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.AWS.controller.repository")

public class AwsDreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDreamApplication.class, args);
	}


}
