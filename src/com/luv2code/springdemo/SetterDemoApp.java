package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the beans from spring container
		TrackCoach trackCoach = context.getBean("trackCoach", TrackCoach.class);
		// call methods on the bean
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(trackCoach.getEmail()); // We have to replace above Coach object to TrackCoach 
												   //since getters for email and teamCount are respective 
												   //to TrackCoach class only.
		System.out.println(trackCoach.getTeamCount());

		//close the context
		context.close();
		

	}

}
