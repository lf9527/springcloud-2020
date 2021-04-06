package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka7001Application.class, args);
		System.out.println("Eureka7001Application spring boot success");
	}

}
