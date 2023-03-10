package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach skateCoach = (Coach) context.getBean("skateCoach");
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(skateCoach.getDailyFortune());
		//close the context
		context.close();

	}

}
