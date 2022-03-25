package com.example.TrackingCashFlowSystem.Exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExchangeService {
    @Autowired
    private ExchangeRepository exchangeRepository;

    public Boolean saveExchange(Exchange exchange) {
        try{
            Optional<Exchange> exchangeOptional = exchangeRepository.findByCurrency(exchange.getCurrency());
            if(exchangeOptional.isPresent()){
                Exchange tmpExchange = exchangeOptional.get();
                tmpExchange.setCurrency(exchange.getCurrency());
                tmpExchange.setRate(exchange.getRate());
                System.out.println("first:");
                System.out.println(tmpExchange);
                exchangeRepository.save(tmpExchange);
            }else{
                System.out.println("Second:");
                exchangeRepository.save(new Exchange(exchange.getCurrency(), exchange.getRate()));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
