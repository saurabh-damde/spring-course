package com.skd.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice Backhand Volley...";
    }

}
