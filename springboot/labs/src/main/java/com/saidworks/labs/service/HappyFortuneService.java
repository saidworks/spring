package com.saidworks.labs.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		 return "Today is your lucky day!";
	}

}
