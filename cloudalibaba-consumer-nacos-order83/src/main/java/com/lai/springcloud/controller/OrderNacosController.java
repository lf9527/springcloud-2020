package com.lai.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderNacosController {

	@Resource
	private RestTemplate restTemplate;
	
	@Value("${service-url.nacos-user-service}")
	private String serverUrl;
	
	@GetMapping("/consumer/payment/nacos/{id}")
	public String paymentInfo(@PathVariable("id")Integer id){
		return restTemplate.getForObject(serverUrl + "/payment/nacos/" + id, String.class);
	}
}
