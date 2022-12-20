package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for dependency
	// we create object of the interface  if a class is implementing any interface,
	// we need to handle the class object in interface variable;
	private FortuneService fortuneService;
	
	//Basically baseball coach class is depending on Happy fortune service class.
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 mins ";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
