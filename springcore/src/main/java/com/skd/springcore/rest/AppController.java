package com.skd.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skd.springcore.common.Coach;

@RestController
public class AppController {

    private Coach coach;

    @Autowired
    public AppController(@Qualifier("swimCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getWorkout();
    }

}
