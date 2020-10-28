package com.moneysupermarket.app.service;

import com.moneysupermarket.app.model.BitcoinExchange;

public interface BitcoinExchangeService {

	BitcoinExchange[] getAllFromBlockChain();

	BitcoinExchange[] getAllFromExmo();

	void save(BitcoinExchange bitcoinExchange);
	
	BitcoinExchange getHighestSellingPrice(String[] currencies);
}
