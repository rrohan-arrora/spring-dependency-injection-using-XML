package com.luv2code.springdemo;

public class SkatingCoach implements Coach {
	
	FortuneService fortuneService;
	
	

	public SkatingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public SkatingCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method to be used during bean life cycle
	public void doMyStartupStuff() {
		System.out.println("Init method during bean initialization");
	}
	
	// add a destroy method to be used at bean closure of destruction
	public void doMyEndStuff() {
		System.out.println("Destroy method at bean closure");
	}
}
