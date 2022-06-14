package com.saidworks.labs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	 @Autowired
	 @Qualifier("randomFortuneService") 
	  private FortuneServices fortuneService;
	 
	 
	  public TennisCoach() { 
	    // this is default constructor
	}
	 
	 
	  public TennisCoach(FortuneServices theFortuneService) {
	     fortuneService = theFortuneService;
	  }
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		 return "Practice your backhand volley";

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
