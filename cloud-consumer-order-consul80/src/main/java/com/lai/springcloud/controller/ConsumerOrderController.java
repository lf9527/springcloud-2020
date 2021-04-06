package com.lai.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ConsumerOrderController {

	public static final String CLOUD_PROVIDER_PAYMENT_URL = "http://cloud-payment-service";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/consumer/order/payment")
	public String payment(){
		log.info("OrderController");
		return restTemplate.getForObject(CLOUD_PROVIDER_PAYMENT_URL + "/payment/consul", String.class);
	}
}
