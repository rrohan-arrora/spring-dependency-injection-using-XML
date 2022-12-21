package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private Integer teamCount;
	
	
	public TrackCoach() {
		System.out.println("Inside TrackCoach no arg constructor");
	}

	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside TrackCoach setter");
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		System.out.println("Inside TrackCoach setter for email address");
		this.email = email;
	}

	public void setTeamCount(Integer teamCount) {
		System.out.println("Inside TrackCoach setter for teamCount address");
		this.teamCount = teamCount;
	}
	
	// getter methods


	public String getEmail() {
		return email;
	}

	public Integer getTeamCount() {
		return teamCount;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "spend 10 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
