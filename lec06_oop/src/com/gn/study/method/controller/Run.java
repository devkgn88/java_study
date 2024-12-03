package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
		// 객체 생성 
		Smartphone myPhone = new Smartphone();
		
		// 1. 반환형 X, 매개변수 X
		myPhone.openApp();
		
		// 2. 반환형 O, 매개변수 X
		int battery = myPhone.checkBatteryLevel();
		System.out.println("현재 배터리 잔량 : "+battery);
		
		// 3. 반환형 X, 매개변수 O
		myPhone.setVolume(15);
		
		// 4. 반환형 O, 매개변수 O
		String result = myPhone.sendMsg("자니?");
		System.out.println(result);
		
	}
}
