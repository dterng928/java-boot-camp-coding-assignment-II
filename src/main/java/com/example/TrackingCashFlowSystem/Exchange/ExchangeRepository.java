package com.example.TrackingCashFlowSystem.Exchange;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExchangeRepository extends JpaRepository<Exchange, Integer> {
    Optional<Exchange> findByCurrency(String currency);
}
