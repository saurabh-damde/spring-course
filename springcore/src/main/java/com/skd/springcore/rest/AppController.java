package com.skd.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skd.springcore.common.Coach;

@RestController
public class AppController {
    private Coach coach;

    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getWorkout();
    }

}
