package com.in28min.microservice.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28min.microservice.currencyexchangeservice.bean.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long>{
	
		public CurrencyExchange findByFromAndTo(String from , String to);

}
