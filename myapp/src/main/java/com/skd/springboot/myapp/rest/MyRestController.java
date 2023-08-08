package com.skd.springboot.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String teamInfo() {
        return "Coach:" + coachName + ", Team: " + teamName;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String workout() {
        return "Run!";
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "Lucky!";
    }
}
