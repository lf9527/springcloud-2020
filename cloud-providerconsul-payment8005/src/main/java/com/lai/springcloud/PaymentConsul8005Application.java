package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8005Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentConsul8005Application.class, args);
		System.out.println("PaymentConsul8005Application spring boot success");
	}

}
