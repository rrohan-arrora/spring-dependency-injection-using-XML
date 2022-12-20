package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the beans from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		// call methods on the bean
		System.out.println(trackCoach.getDailyFortune());
		//close the context
		context.close();
		

	}

}
