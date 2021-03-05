package com.fv.springdemo;

public class CricketCoach implements Coach {

	public FortuneService fortuneService;

	// Create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg constructor");	
	}

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
