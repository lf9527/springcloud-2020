package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApplication83 {

	public static void main(String[] args) {
		SpringApplication.run(OrderNacosApplication83.class, args);
		System.out.println("OrderNacosApplication83 spring boot success");
	}

}
