package com.in28min.microservice.bean;

import java.math.BigDecimal;


public class CurrencyConversion {
	private long id;
	private String from;
	private String to;
	private BigDecimal qty;
	private BigDecimal conversionMultiple;
	
	public CurrencyConversion(long id, String from, String to, BigDecimal qty, BigDecimal conversionMultiple,
			BigDecimal totalAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.qty = qty;
		this.conversionMultiple = conversionMultiple;
		this.totalAmount = totalAmount;
		this.environment = environment;
	}
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	private BigDecimal totalAmount;
	private String environment;
	
}
