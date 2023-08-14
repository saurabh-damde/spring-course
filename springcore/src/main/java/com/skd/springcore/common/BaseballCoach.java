package com.skd.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Batting Practice...";
    }

}
