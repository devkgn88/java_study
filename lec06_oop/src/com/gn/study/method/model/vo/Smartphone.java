package com.gn.study.method.model.vo;

public class Smartphone {
	// 1. 반환형 X, 매개변수 X
	public void openApp() {
		System.out.println("앱이 열렸습니다!");
	}
	
	// 2. 반환형 O, 매개변수 X
	public int checkBatteryLevel() {
		int battery = 85; // 배터리 잔량
		return battery;
	}
	
	// 3. 반환형 X, 매개변수 O
	public void setVolume(int volume) {
		System.out.println("볼륨이 "+volume+"으로 설정되었습니다.");
	}
	
	// 4. 반환형 O, 매개변수 O
	public String sendMsg(String msg) {
		return "메시지 \""+msg+"\"가 전송되었습니다.";
	}
}
