package com.saidworks.labs.service;

import org.springframework.stereotype.Component;

@Component
public class DatabseFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		 return "Database connection";

	}

}
