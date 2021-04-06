package com.lai.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.lai.springcloud.dao")
@SpringBootApplication
@EnableEurekaClient
public class Payment8002Application {

	public static void main(String[] args) {
		SpringApplication.run(Payment8002Application.class, args);
		System.out.println("Payment8002Application spring boot success");

	}

}
