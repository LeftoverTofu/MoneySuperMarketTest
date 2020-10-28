package com.moneysupermarket.app.service.impl;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.ArgumentMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.moneysupermarket.app.model.BitcoinExchange;
import com.moneysupermarket.app.repository.BitcoinExchangeRepository;
import com.moneysupermarket.app.service.BitcoinExchangeService;

@RunWith(MockitoJUnitRunner.class)
public class BitcoinExchangeServiceImplTest {

	@Mock
	private BitcoinExchangeRepository bitcoinExchangeRepository;
	
	@Mock
	private RestTemplate restTemplate;
	
	private BitcoinExchangeService bitcoinExchangeService;
	
	@Before
	public void setUp() throws Exception {
		bitcoinExchangeService = new BitcoinExchangeServiceImpl(bitcoinExchangeRepository, restTemplate);
	}

	@Test
	public void getAllFromBlockChain_returnBitcoinExchanges() {
		BitcoinExchange bitcoinExchange = new BitcoinExchange("https://blockchain.info/ticker", "USD", 13122.13, 13122.13, 13122.13);
		BitcoinExchange[] bitcoinExchangeArray = new BitcoinExchange[]{ bitcoinExchange };
		ResponseEntity<BitcoinExchange[]> response = new ResponseEntity<BitcoinExchange[]>(bitcoinExchangeArray, HttpStatus.OK);
		
		given(restTemplate.getForEntity("https://blockchain.info/ticker", BitcoinExchange[].class))
			.willReturn(response);
		
		System.out.println(response.getBody().toString());
		
		assertArrayEquals("Bitcoin exchange does not match", bitcoinExchangeArray, response.getBody());
	}

	@Test
	public void getAllFromExmo_returnBitcoinExchanges() {
		fail("Not yet implemented");
	}
	
	public void getHighestSellingPrice_returnBitcoinExchange() {
		fail("Not yet implemented");
	}
}
