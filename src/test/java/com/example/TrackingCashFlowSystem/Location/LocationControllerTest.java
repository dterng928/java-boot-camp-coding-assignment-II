package com.example.TrackingCashFlowSystem.Location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LocationControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void positiveUpdateLocation() {
        Location location = new Location(123456, -25.363, 131.044);
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<Location> request = new HttpEntity<>(location, headers);
        ResponseEntity<String> result = testRestTemplate.postForEntity("/location", request, String.class);

        assertEquals(true, result.getBody().contains("SUCCESS"));
    }
}