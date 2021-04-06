package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderZk80Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerOrderZk80Application.class, args);
		System.out.println("ConsumerOrderZk80Application spring boot success");

	}

}
