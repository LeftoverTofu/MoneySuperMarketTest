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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(buy);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		temp = Double.doubleToLongBits(last);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameOfAPI == null) ? 0 : nameOfAPI.hashCode());
		temp = Double.doubleToLongBits(sell);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BitcoinExchange other = (BitcoinExchange) obj;
		if (Double.doubleToLongBits(buy) != Double.doubleToLongBits(other.buy))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(last) != Double.doubleToLongBits(other.last))
			return false;
		if (nameOfAPI == null) {
			if (other.nameOfAPI != null)
				return false;
		} else if (!nameOfAPI.equals(other.nameOfAPI))
			return false;
		if (Double.doubleToLongBits(sell) != Double.doubleToLongBits(other.sell))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BitcoinExchange [id=" + id + ", nameOfAPI=" + nameOfAPI + ", currency=" + currency + ", last=" + last
				+ ", buy=" + buy + ", sell=" + sell + "]";
	}
	
	
}