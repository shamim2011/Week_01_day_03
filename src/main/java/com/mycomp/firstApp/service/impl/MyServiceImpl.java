package com.mycomp.firstApp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycomp.firstApp.service.MyService;

@Component
public class MyServiceImpl implements MyService {

	private static final Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);
	
	public MyServiceImpl() {
		logger.info("MyServiceImpl constructor********** this:{}",this);
	}
	
	@Override
	public String add(int val1, int val2) {
		logger.info("val1: {}, val2: {}", val1, val2);
		
		int result = val1 + val2;
		logger.info("result: {}", result);
		
		return "From service : " + result;
	}
	
}
