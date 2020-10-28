package com.moneysupermarket.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneysupermarket.app.repository.BitcoinExchangeRepository;
import com.moneysupermarket.app.service.BitcoinExchangeService;

@Service
public class BitcoinExchangeServiceImpl implements BitcoinExchangeService {

	private BitcoinExchangeRepository bitcoinExchangeRepository;
	
	@Autowired
	public BitcoinExchangeServiceImpl(BitcoinExchangeRepository bitcoinExchangeRepository) {
		this.bitcoinExchangeRepository = bitcoinExchangeRepository;
	}

}
