package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		
		// load the application context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// configure the beans
		SkatingCoach coach = context.getBean("skatingCoach", SkatingCoach.class);
		System.out.println(coach.getDailyFortune());
		
		// close the bean
		context.close();
		
	}

}
