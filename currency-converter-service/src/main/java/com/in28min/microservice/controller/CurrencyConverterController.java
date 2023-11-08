package com.in28min.microservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.in28min.microservice.CurrencyExchangeProxy;
import com.in28min.microservice.bean.CurrencyConversion;

@RestController
public class CurrencyConverterController {
	
	
	@Autowired
	CurrencyExchangeProxy proxy;

	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{qty}")
	public CurrencyConversion convert_feign(@PathVariable String from ,
									@PathVariable String to ,
									@PathVariable BigDecimal qty) {

		CurrencyConversion cc=proxy.exhange(from, to);
		
		return new CurrencyConversion(cc.getId(),from,to,qty,cc.getConversionMultiple(),
									 qty.multiply(cc.getConversionMultiple()),cc.getEnvironment()+"-Feign");
			
	}
	
	
	
	
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{qty}")
	public CurrencyConversion convert(@PathVariable String from ,
									@PathVariable String to ,
									@PathVariable BigDecimal qty) {
		
		
			HashMap<String,String> uriVariables=new HashMap<>();
			uriVariables.put("from", from);
			uriVariables.put("to", to);
			
		
		
			ResponseEntity<CurrencyConversion> responseEntity= 
					new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}/", 
					CurrencyConversion.class,
											uriVariables);
			
			CurrencyConversion ce=responseEntity.getBody();
			
					
			return new CurrencyConversion(ce.getId(),from,to,qty,ce.getConversionMultiple(),
					qty.multiply(ce.getConversionMultiple()),ce.getEnvironment());
	}

}
