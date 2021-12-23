package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private ArrayList<String> fortunes = new ArrayList<String>();

	public HappyFortuneService() {
		fortunes.add("Today");
		fortunes.add("Your");
		fortunes.add("Lucky");
	}
	
	@Override
	public String getFortune() {
		Random random = new Random();
		
		int number = random.nextInt(3 - 1 + 1) + 1;
		
		return fortunes.get(number);
	}

}
