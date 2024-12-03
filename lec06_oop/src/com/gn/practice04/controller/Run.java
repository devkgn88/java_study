package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car myCar = new Car();	
		
		myCar.startEngine();
		
		int defaultSpeed = myCar.checkSpeed();
		System.out.println("기본 속도는 "+defaultSpeed+"km/h 입니다.");
		
		myCar.setSpeed(150);
		
		String sentence = myCar.setDestination("부산");
		System.out.println(sentence);
	}
}
