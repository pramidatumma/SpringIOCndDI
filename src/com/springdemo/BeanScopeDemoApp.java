package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach aplhaCoach = context.getBean("myCoach", Coach.class);

        boolean res = (theCoach == aplhaCoach);
        System.out.println(res);
        System.out.println(theCoach.equals(aplhaCoach));
        System.out.println("Memory locn for theCoach:" + theCoach);
        System.out.println("Memory locn for alphaCoach:" + aplhaCoach);

        context.close();
    }
}
