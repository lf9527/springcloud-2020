package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004Application {

	public static void main(String[] args) {
		SpringApplication.run(Payment8004Application.class, args);
		System.out.println("Payment8004Application spring boot success");
	}

}
