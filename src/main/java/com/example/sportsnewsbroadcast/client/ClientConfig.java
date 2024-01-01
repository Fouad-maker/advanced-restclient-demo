package com.example.sportsnewsbroadcast.client;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@RequiredArgsConstructor
public class ClientConfig {

    private final ClientProperties clientProperties;

    @Bean
    public RestClient footballClient() {
        return RestClient.builder()
                .baseUrl(clientProperties.getClientBaseUrl())
                .defaultHeader("X-RapidAPI-Key",clientProperties.getApiKey())
                .defaultHeader("X-RapidAPI-Host",clientProperties.getHostName())
                .build();
    }





}
