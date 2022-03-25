package com.example.TrackingCashFlowSystem.Transaction;

public class TransactionResponse {
    private String status;

    TransactionResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
