package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		System.out.print(theCoach.getEmailAddress() + "\n");
		System.out.print(theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
