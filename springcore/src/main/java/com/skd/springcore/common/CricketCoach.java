package com.skd.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice Fast Bowling...";
    }

}
