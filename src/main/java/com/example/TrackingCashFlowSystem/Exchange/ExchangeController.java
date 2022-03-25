package com.example.TrackingCashFlowSystem.Exchange;

import com.example.TrackingCashFlowSystem.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;

    @PostMapping("/exchange")
    public ExchangeResponse updateExchangeRate(@RequestBody Exchange exchange) {
        if(exchangeService.saveExchange(exchange)){
            return new ExchangeResponse(ResponseStatus.SUCCESS.getStatus());
        }
        return new ExchangeResponse(ResponseStatus.FAIL.getStatus());
    }
}
