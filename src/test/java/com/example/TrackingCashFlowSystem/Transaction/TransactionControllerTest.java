package com.example.TrackingCashFlowSystem.Transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TransactionControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void positiveInsertTransactionAmount() {
        Transaction transaction = new Transaction(1234, 123.06);
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<Transaction> request = new HttpEntity<Transaction>(transaction, headers);
        ResponseEntity<String> result = testRestTemplate.postForEntity("/transaction", request, String.class);

        assertEquals(true, result.getBody().contains("SUCCESS"));
    }
}