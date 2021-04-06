package com.lai.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class CustomSelfRule {

	@Bean
	public IRule rule(){
		return new RandomRule();
	}
}
