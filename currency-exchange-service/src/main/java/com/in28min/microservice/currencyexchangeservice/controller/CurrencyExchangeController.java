package com.in28min.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.microservice.currencyexchangeservice.bean.CurrencyExchange;
import com.in28min.microservice.currencyexchangeservice.repo.CurrencyExchangeRepo;


@RestController
public class CurrencyExchangeController {

		@Autowired
		Environment env;
		
		@Autowired
		CurrencyExchangeRepo currRepo;
		
		@GetMapping("/currency-exchange/from/{from}/to/{to}")
		public CurrencyExchange exhange(@PathVariable String from , 
							@PathVariable String to) {
			 	
					CurrencyExchange exchange=currRepo.findByFromAndTo(from, to);
					String port=env.getProperty("local.server.port");
					exchange.setEnvironment(port);
					return exchange;
			
		}
	
	
	
}
