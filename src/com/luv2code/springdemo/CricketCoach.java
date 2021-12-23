package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.print("CricketCoach: inside setter method - setEmailAddress\n");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.print("CricketCoach: inside setter method - setTeam\n");
		this.team = team;
	}

	// create a no-argument constructor
	public CricketCoach() {
		System.out.print("CricketCoach: inside no-arg constructor\n");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.print("CricketCoach: inside setter method - setFortuneService\n");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.\n";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
