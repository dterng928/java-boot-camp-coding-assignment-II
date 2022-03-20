package com.example.TrackingCashFlowSystem;

public enum ResponseStatus {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private String status;

    ResponseStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
