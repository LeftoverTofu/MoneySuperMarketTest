package com.moneysupermarket.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.moneysupermarket.app.exception.BitcoinExchangeNotFoundException;
import com.moneysupermarket.app.model.BitcoinExchange;
import com.moneysupermarket.app.repository.BitcoinExchangeRepository;
import com.moneysupermarket.app.service.BitcoinExchangeService;

@Service
public class BitcoinExchangeServiceImpl implements BitcoinExchangeService {

	private BitcoinExchangeRepository bitcoinExchangeRepository;
	private RestTemplate restTemplate;
	
	private String blockChainUrl;
	
	@Autowired
	public BitcoinExchangeServiceImpl(BitcoinExchangeRepository bitcoinExchangeRepository, RestTemplate restTemplate) {
		this.bitcoinExchangeRepository = bitcoinExchangeRepository;
		this.restTemplate = restTemplate;
		
		blockChainUrl = "https://blockchain.info/ticker";
	}

	public BitcoinExchange[] getAllFromBlockChain() {
		ResponseEntity<BitcoinExchange[]> response = restTemplate.getForEntity(blockChainUrl, BitcoinExchange[].class); 
		
		if(response.getStatusCode() == HttpStatus.NOT_FOUND)
			throw new BitcoinExchangeNotFoundException();
		
		return response.getBody();
	}
	
	public BitcoinExchange[] getAllFromExmo() {
		return null;
	}
	
	public BitcoinExchange getHighestSellingPrice() {
		return null;
	}
}
