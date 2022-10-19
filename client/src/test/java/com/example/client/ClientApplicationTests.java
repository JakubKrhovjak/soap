package com.example.client;

import com.example.client.gen.GetCountryResponse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientApplicationTests {

    @Autowired
    CountryClient client;


    @Test
    void contextLoads() {
        GetCountryResponse poland = client.getCountry("Poland");
    }

}
