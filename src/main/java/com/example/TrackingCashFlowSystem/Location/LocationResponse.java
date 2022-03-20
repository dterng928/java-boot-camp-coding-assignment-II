package com.example.TrackingCashFlowSystem.Location;

public class LocationResponse {

    private String status;

    LocationResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
