package com.skd.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice Fast Bowling...";
    }

}
