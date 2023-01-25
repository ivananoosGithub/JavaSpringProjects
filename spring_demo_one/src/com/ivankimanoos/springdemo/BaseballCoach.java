package com.ivankimanoos.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins in batting practice";
	}
}
