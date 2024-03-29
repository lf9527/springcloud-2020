package com.lai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication3377 {

	public static void main(String[] args) {
		SpringApplication.run(NacosConfigClientApplication3377.class, args);
		System.out.println("NacosConfigClientApplication3377 spring boot success");
	}

}
