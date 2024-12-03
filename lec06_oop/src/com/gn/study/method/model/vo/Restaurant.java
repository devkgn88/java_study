package com.gn.study.method.model.vo;

public class Restaurant {
	// 1. 매개변수X
	public void welcomeMsg() {
		System.out.println("어서오세요!환영합니다~");
	}
	// 2. 기본형 매개변수
	public void setTableNumber(int tableNumber) {
		System.out.println("테이블 번호 "+tableNumber+"에 앉으시면 됩니다~");
	}
	// 3. 배열 매개변수
	public void processOrder(String[] menuItems) {
		System.out.println("주문하신 메뉴 확인하겠습니다.");
		for(String item : menuItems) {
			System.out.println(item);
		}
	}
	// 4. 클래스 매개변수
	public void sodaSetting(Soda soda) {
		System.out.println(soda.name+" 먼저 셋팅하겠습니다.");
	}
}
