package com.skd.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Run Hard!";
    }

}
