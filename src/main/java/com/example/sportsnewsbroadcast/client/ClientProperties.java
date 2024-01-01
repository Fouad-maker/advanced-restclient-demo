package com.example.sportsnewsbroadcast.client;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ClientProperties {

    @Value("${client.football.baseUrl}")
    private String clientBaseUrl;

    @Value("${client.football.host}")
    private String hostName;

    @Value("${client.apikey}")
    private String apiKey;

}
