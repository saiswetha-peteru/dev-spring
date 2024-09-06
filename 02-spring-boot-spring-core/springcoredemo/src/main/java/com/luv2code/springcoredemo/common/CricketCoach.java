package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    // for doing stuff before bean is intialised
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff");
    }

    //stuff after bean cycle ends
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 minutes :-)";
    }
}
