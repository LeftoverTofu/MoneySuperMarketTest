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
	private float last;
	private float buy;
	private float sell;

	public BitcoinExchange(String nameOfAPI, String currency, float last, float buy, float sell) {
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

	public float getLast() {
		return last;
	}

	public void setLast(float last) {
		this.last = last;
	}

	public float getBuy() {
		return buy;
	}

	public void setBuy(float buy) {
		this.buy = buy;
	}

	public float getSell() {
		return sell;
	}

	public void setSell(float sell) {
		this.sell = sell;
	}

}
