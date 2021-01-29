package com.luv2code.Springdemo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

    @Autowired  //uses java technology called reflection for field dependency injection
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach()
    {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    //define a setter method dependency injection
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService)
//    {
//        System.out.println(">>TennisCoach : inside setFortuneService() method");
//        fortuneService = theFortuneService;
//    }

//    @Autowired //Constructor injection
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() ;
    }
}
