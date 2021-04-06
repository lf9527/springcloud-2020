package com.lai.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lai.springcloud.entities.CommonResult;
import com.lai.springcloud.entities.Payment;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController {

//	public static final String PAYMENT_URL = "http://localhost:8001/payment";
	//
	public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/payment";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/order/payment/create")
	public CommonResult create(Payment payment){
		return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
	}
	@GetMapping("/order/payment/get/{id}")
	public CommonResult get(@PathVariable("id") Long id){
		log.info("id: " + id);
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
	}
}
