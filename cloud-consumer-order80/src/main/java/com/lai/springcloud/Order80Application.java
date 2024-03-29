package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Order80Application {

	public static void main(String[] args) {
		SpringApplication.run(Order80Application.class, args);
		System.out.println("Order80Application spring boot success");
	}

}
