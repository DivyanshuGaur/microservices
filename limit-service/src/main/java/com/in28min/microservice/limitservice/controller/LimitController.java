package com.in28min.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.microservice.limitservice.bean.Limit;
import com.in28min.microservice.limitservice.config.Configuration;

@RestController
public class LimitController {
	
		@Autowired
		Configuration config;
		
		@GetMapping("/limit-service")
		public Limit getLimits() {
				
				return new Limit(config.getMin(),config.getMax());
			
		}

}
