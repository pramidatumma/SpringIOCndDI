package com.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    //Constructor based Dependency Injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in cult exercise";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
