package com.skd.springboot.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
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
