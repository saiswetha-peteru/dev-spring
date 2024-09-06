package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define  a private feild for the dependency
    private Coach myCoach;

    private Coach anotherCoach;

    //constructor injection
    //two same beans for scope testing
    @Autowired
    public DemoController(@Qualifier("baseballCoach")Coach theCoach,
                          @Qualifier("baseballCoach")Coach theAnotherCoach){
  //      myCoach=theCoach;
   //     anotherCoach=theAnotherCoach;
    }

    //setter injection
    @Autowired
    //aquatic for spring bean config demonstration
    public void setCoach(@Qualifier("aquatic")Coach theCoach){
        myCoach=theCoach;
    }

    // any method injection
    @Autowired
    public void dologic(Coach theCoach){
   //     myCoach=theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "comparing beans: myCoach == anotherCoach,"+(myCoach==anotherCoach);
    }
}
