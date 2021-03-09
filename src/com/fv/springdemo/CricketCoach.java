package com.fv.springdemo;

public class CricketCoach implements Coach {

	// Fields
	private String team;
	private String emailAdress;
	
	public FortuneService fortuneService;

	// Create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg constructor");	
	}

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// Create setters	
	public void setTeam(String team) {
		System.out.println("Inside the setTeam");
		this.team = team;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("Inside the setEmailAdress");
		this.emailAdress = emailAdress;
	}
	
	// Create getters

	public String getTeam() {
		return team;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: inside the setFortuneService method");
	}

	@Override
	public String getDailyWorkout() {
		return "practice bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
