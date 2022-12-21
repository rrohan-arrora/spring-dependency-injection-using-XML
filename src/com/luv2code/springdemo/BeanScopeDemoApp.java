package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		SkatingCoach coach1 = context.getBean("skatingCoach", SkatingCoach.class);
		Coach coach2 = context.getBean("skatingCoach", Coach.class);
		System.out.println(coach1.getDailyFortune());
		System.out.println(coach2.getDailyFortune());
		
		System.out.println(coach1==coach2);
		System.out.println(coach1);
		System.out.println(coach1);
		
		//close the context
		context.close();
		
	}

}
