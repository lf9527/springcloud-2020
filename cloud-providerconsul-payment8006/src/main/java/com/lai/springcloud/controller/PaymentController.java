package com.lai.springcloud.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/payment/consul")
	public String payment(){
		log.info("serverPort");
		return "server port : " + serverPort + " " + UUID.randomUUID().toString();
	}
}
