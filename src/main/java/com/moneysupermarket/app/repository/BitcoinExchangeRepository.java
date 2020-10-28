package com.moneysupermarket.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moneysupermarket.app.model.BitcoinExchange;

@Repository
public interface BitcoinExchangeRepository extends JpaRepository<BitcoinExchange, Long> {

}
