package com.springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "You will have a great day today!";
    }
}
