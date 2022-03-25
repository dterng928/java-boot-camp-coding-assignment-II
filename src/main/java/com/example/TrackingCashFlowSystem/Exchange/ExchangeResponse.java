package com.example.TrackingCashFlowSystem.Exchange;

public class ExchangeResponse {
    private String status;

    ExchangeResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
