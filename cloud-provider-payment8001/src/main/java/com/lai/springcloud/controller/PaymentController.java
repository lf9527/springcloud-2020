package com.lai.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lai.springcloud.entities.CommonResult;
import com.lai.springcloud.entities.Payment;
import com.lai.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@Value("${server.port}")
	private String serverPort;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/payment/create")
	public CommonResult create(@RequestBody Payment payment){
		int result = paymentService.create(payment);
		log.info("create result: " + result);
		if(result > 0){
			return new CommonResult(200, "create data success", result);
		}
		else{
			return new CommonResult(400, "create data error");
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable("id") Long id){
		Payment result = paymentService.getPaymentById(id);
		log.info("create result: " + result);
		if(result != null){
			return new CommonResult(200, "get data success lb 8001", result);
		}
		else{
			return new CommonResult(400, "get data error");
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/payment/lb/{id}")
	public CommonResult getPaymentByIds(@PathVariable("id") Long id){
		log.info("create server.port: " + serverPort);
		return new CommonResult(200, "get data success 8001", serverPort);
	}
}
