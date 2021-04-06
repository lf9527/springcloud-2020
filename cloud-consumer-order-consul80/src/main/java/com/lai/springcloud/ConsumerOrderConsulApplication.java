package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lai.ribbon.CustomSelfRule;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name="cloud-payment-service",configuration=CustomSelfRule.class)
public class ConsumerOrderConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerOrderConsulApplication.class, args);
		System.out.println("ConsumerOrderConsulApplication spring boot success");
	}

}
