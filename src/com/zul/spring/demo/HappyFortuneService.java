package com.zul.spring.demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today your lucky day";
	}

}
