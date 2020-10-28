package com.moneysupermarket.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BitcoinExchange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nameOfAPI;

	private String currency;
	private double last;
	private double buy;
	private double sell;

	public BitcoinExchange(String nameOfAPI, String currency, double last, double buy, double sell) {
		this.nameOfAPI = nameOfAPI;
		this.currency = currency;
		this.last = last;
		this.buy = buy;
		this.sell = sell;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOfAPI() {
		return nameOfAPI;
	}

	public void setNameOfAPI(String nameOfAPI) {
		this.nameOfAPI = nameOfAPI;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getLast() {
		return last;
	}

	public void setLast(double last) {
		this.last = last;
	}

	public double getBuy() {
		return buy;
	}

	public void setBuy(double buy) {
		this.buy = buy;
	}

	public double getSell() {
		return sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
	}
}