package com.lai.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lai.springcloud.entities.Payment;

//@Mapper//启动类添加@MapperScan("com.scut.thunderlearn.dao")
public interface PaymentDao {

	public int create(Payment payment);
	
	public Payment getPaymentById(@Param("id")Long id);
}
