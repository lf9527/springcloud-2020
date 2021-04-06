package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentConsul8006Application.class, args);
		System.out.println("PaymentConsul8006Application spring boot success");
	}

}
