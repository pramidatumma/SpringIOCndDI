package com.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Do Track exercises";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it:" + fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("Inside startup stuff");
    }

    public void doMyCleanupStuff() {
        System.out.println("Inside Cleaning");
    }
}
