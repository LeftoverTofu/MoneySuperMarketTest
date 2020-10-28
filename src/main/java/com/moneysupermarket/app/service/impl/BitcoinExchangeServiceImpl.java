package com.moneysupermarket.app.service.impl;

import java.util.Optional;

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
	private String exmoUrl;
	
	@Autowired
	public BitcoinExchangeServiceImpl(BitcoinExchangeRepository bitcoinExchangeRepository, RestTemplate restTemplate) {
		this.bitcoinExchangeRepository = bitcoinExchangeRepository;
		this.restTemplate = restTemplate;
		
		blockChainUrl = "https://blockchain.info/ticker";
		exmoUrl = "https://api.exmo.com/v1/ticker";
	}

	@Override
	public BitcoinExchange[] getAllFromBlockChain() {
		return makeAPICallForBitcoinExchanges(blockChainUrl);
	}
	
	@Override
	public BitcoinExchange[] getAllFromExmo() {		
		return makeAPICallForBitcoinExchanges(exmoUrl);
	}
	
	private BitcoinExchange[] makeAPICallForBitcoinExchanges(String url) {
		ResponseEntity<BitcoinExchange[]> response = restTemplate.getForEntity(url, BitcoinExchange[].class); 

		if(response.getStatusCode() == HttpStatus.NOT_FOUND)
			throw new BitcoinExchangeNotFoundException();
		
		return response.getBody();
	}
	
	@Override
	public void save(BitcoinExchange bitcoinExchange) {
		bitcoinExchangeRepository.save(bitcoinExchange);
	}
	
	@Override
	public BitcoinExchange getHighestSellingPrice(String[] currencies) {
		Optional<BitcoinExchange> bitcoinExchange = bitcoinExchangeRepository.findHighestSellingPrice(currencies);
	
		if(bitcoinExchange.isPresent())
			return bitcoinExchange.get();
		
		throw new BitcoinExchangeNotFoundException();
	}
}
