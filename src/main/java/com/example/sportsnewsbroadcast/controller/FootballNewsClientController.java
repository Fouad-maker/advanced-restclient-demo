package com.example.sportsnewsbroadcast.controller;

import com.example.sportsnewsbroadcast.client.FootballNewsServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football")
@RequiredArgsConstructor
public class FootballNewsClientController {

    private final FootballNewsServiceClient footballNewsServiceClient;

    @GetMapping("")
    public String getFootballPlayerInfo() {
        return footballNewsServiceClient.getPlayerInfo();
    }
}
