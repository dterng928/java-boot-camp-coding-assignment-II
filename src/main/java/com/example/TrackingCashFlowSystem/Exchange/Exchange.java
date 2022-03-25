package com.example.TrackingCashFlowSystem.Exchange;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String currency;
    private Double rate;

    public Exchange() {
    }

    public Exchange(int id, String currency, Double rate) {
        this.id = id;
        this.currency = currency;
        this.rate = rate;
    }

    public Exchange(String currency, Double rate) {
        this.currency = currency;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
