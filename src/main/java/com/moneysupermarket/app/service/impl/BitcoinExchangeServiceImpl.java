package com.moneysupermarket.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.moneysupermarket.app.repository.BitcoinExchangeRepository;
import com.moneysupermarket.app.service.BitcoinExchangeService;

@Service
public class BitcoinExchangeServiceImpl implements BitcoinExchangeService {

	private BitcoinExchangeRepository bitcoinExchangeRepository;
	private RestTemplate restTemplate;
	
	@Autowired
	public BitcoinExchangeServiceImpl(BitcoinExchangeRepository bitcoinExchangeRepository, RestTemplate restTemplate) {
		this.bitcoinExchangeRepository = bitcoinExchangeRepository;
		this.restTemplate = restTemplate;
	}

}
