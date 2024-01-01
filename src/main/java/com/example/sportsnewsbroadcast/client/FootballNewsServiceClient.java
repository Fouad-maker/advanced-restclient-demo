package com.example.sportsnewsbroadcast.client;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
@RequiredArgsConstructor
public class FootballNewsServiceClient {

    private final RestClient footballClient;



    public String getPlayerInfo() {
        return footballClient.get().uri("/players?id=276&season=2019")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }


}
