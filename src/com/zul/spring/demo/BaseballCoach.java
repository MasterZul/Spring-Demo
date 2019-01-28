package com.zul.spring.demo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minute on batting practice";		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
