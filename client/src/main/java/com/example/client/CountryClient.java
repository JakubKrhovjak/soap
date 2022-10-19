package com.example.client;

import com.example.client.gen.GetCountryRequest;
import com.example.client.gen.GetCountryResponse;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by Jakub Krhovják on 10/19/22.
 */
public class CountryClient extends WebServiceGatewaySupport {

    public GetCountryResponse getCountry(String country) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);
        return response;
    }

}
