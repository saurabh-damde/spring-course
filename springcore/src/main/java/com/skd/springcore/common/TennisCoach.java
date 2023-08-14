package com.skd.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice Backhand Volley...";
    }

}
