package com.skd.springcore.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println("Doing Startup Stuff!");
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("Doing Cleanup Stuff!");
    }

    @Override
    public String getWorkout() {
        return "Batting Practice...";
    }

}
