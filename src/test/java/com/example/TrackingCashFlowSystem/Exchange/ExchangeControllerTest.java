package com.example.TrackingCashFlowSystem.Exchange;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExchangeControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void updateExchangeRate() {
        Exchange exchange = new Exchange("USA", 33.06);
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<Exchange> request = new HttpEntity<Exchange>(exchange, headers);
        ResponseEntity<String> result = testRestTemplate.postForEntity("/exchange", request, String.class);

        assertEquals(true, result.getBody().contains("SUCCESS"));
    }
}