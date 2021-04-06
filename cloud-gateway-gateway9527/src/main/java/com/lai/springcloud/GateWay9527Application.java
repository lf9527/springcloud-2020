package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWay9527Application {

	public static void main(String[] args) {
		SpringApplication.run(GateWay9527Application.class, args);
		System.out.println("GateWay9527Application spring boot success");
	}

}
