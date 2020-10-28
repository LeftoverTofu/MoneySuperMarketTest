package com.moneysupermarket.app.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.moneysupermarket.app.repository.BitcoinExchangeRepository;
import com.moneysupermarket.app.service.BitcoinExchangeService;

@RunWith(MockitoJUnitRunner.class)
public class BitcoinExchangeServiceImplTest {

	@Mock
	private BitcoinExchangeRepository bitcoinExchangeRepository;
	
	private BitcoinExchangeService bitcoinExchangeService;
	
	@Before
	public void setUp() throws Exception {
		bitcoinExchangeService = new BitcoinExchangeServiceImpl(bitcoinExchangeRepository);
	}

	@Test
	public void getAllFromBlockChain_returnBitcoinExchanges() {
		fail("Not yet implemented");
	}

	@Test
	public void getAllFromExmo_returnBitcoinExchanges() {
		fail("Not yet implemented");
	}
	
	public void getHighestSellingPrice_returnBitcoinExchange() {
		fail("Not yet implemented");
	}
}
