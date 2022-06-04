package com.probotisop.entity;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

public class Coin {

	LocalTime time;
	private String Symbol;
	private String target;
	private String Price;

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Coin(LocalTime time, String symbol, String target, String price) {
		super();
		this.time = time;
		Symbol = symbol;
		this.target = target;
		Price = price;
	}

	public Coin() {
		super();

	}

}
