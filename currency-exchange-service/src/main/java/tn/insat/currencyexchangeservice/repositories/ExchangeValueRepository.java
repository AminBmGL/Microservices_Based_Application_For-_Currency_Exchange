package tn.insat.currencyexchangeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.insat.currencyexchangeservice.domain.ExchangeValue;

public interface ExchangeValueRepository extends 
JpaRepository<ExchangeValue, Long>{
ExchangeValue findByFromAndTo(String from, String to);
}
