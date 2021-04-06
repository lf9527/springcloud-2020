package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Order80OpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Order80OpenFeignApplication.class, args);
		System.out.println("Order80OpenFeignApplication spring boot success");
	}

}
