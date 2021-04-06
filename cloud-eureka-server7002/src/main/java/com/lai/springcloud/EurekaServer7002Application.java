package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002Application.class, args);
		System.out.println("EurekaServer7002Application spring boot success");

	}

}
