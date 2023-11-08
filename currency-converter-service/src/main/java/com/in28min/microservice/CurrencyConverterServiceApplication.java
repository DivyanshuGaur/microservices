package com.in28min.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CurrencyConverterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterServiceApplication.class, args);
	}

}
