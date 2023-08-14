package com.skd.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skd.springcore.common.Coach;

@RestController
public class AppController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public AppController(@Qualifier("baseballCoach") Coach coach,
            @Qualifier("baseballCoach") Coach anotherCoach) {
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comaparing Beans: coach & anotherCoach, " + (coach == anotherCoach);
    }

}
