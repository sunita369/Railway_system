package com.railway.MainAdmin;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.railway.MainAdmin.Controller"})
@EnableEurekaClient
@EnableMongoRepositories(basePackages = {"com.railway.MainAdmin.repositories"})
public class MainAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAdminApplication.class, args);
	}

}
