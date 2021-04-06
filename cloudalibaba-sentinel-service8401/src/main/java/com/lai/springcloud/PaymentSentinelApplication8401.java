package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentSentinelApplication8401 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSentinelApplication8401.class, args);
		System.out.println("PaymentSentinelApplication8401 spring boot success");
	}

}
