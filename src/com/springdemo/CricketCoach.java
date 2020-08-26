package com.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("Cricekt Coach no arg const");
        fortuneService = null;
        emailAddress = "";
        team = "";
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setting Fortune Service");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Setting emailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Setting team");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Do Batting exercises for 30 min";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket Fortune:" + fortuneService.getFortune();
    }
}
