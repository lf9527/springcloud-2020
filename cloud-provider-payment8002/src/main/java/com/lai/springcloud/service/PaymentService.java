package com.lai.springcloud.service;

import com.lai.springcloud.entities.Payment;

public interface PaymentService {

	public int create(Payment payment);
	
	public Payment getPaymentById(Long id);
}
