package com.lai.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lai.springcloud.entities.CommonResult;
import com.lai.springcloud.entities.Payment;
import com.lai.springcloud.service.PaymentFeignService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderFeignController {

	@Autowired
	private PaymentFeignService paymentFeignService;
	
	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
		log.info("id : " + id);
		return paymentFeignService.getPaymentById(id);
	}
}
