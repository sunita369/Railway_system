package com.railway.MainAdmin;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MainAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAdminApplication.class, args);
	}

}
