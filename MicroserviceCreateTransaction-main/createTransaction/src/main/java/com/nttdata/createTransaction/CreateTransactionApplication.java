package com.nttdata.createTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CreateTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateTransactionApplication.class, args);
	}

}
