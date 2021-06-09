package com.railway.Train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.railway.Train.Controller"})
@EnableEurekaClient
@EnableMongoRepositories(basePackages = "com.railway.Train.Repositories")
public class TrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainApplication.class, args);
	}

}
