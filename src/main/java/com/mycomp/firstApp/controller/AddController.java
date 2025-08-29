package com.mycomp.firstApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.firstApp.service.MyService;


//Controller class
@RestController
@RequestMapping("/api") 
public class AddController { 

	private static final Logger logger = LoggerFactory.getLogger(AddController.class);
	
	
	private MyService myservice;
	
	public AddController(MyService myservice) {
		logger.info("AddController Constructor******* this:{}",this);
		this.myservice=myservice;
	}
	
    @GetMapping("/add")
    public String addTwoNumbers(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        logger.info("Adding numbers: {} + {} = {}", a, b, sum); 
        
        
        logger.info("Object MyService: {}",myservice);
        
        String result = myservice.add(a,b);
        
        logger.info("Result: {}",result); 
        
        return result;
    }
}
