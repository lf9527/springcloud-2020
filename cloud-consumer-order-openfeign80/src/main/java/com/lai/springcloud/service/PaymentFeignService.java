package com.lai.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lai.springcloud.entities.CommonResult;
import com.lai.springcloud.entities.Payment;

@Component
@FeignClient(value ="cloud-payment-service")
public interface PaymentFeignService {

	@PostMapping("/payment/payment/create")
	public int create(Payment payment);
	
	@GetMapping("/payment/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id);
}
