package com.moneysupermarket.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moneysupermarket.app.model.BitcoinExchange;

@Repository
public interface BitcoinExchangeRepository extends JpaRepository<BitcoinExchange, Long> {

	@Query("SELECT b2 FROM BitcoinExchange b2 WHERE (b2.id, b2.sell) "
			+ "IN "
			+ "(SELECT b.id, MAX(b.sell) FROM BitcoinExchange b WHERE b.currency IN (?1))")
	Optional<BitcoinExchange> findHighestSellingPrice(String[] currencies);

}
