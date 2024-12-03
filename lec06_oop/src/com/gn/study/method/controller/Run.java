package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
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
		
		// 객체 생성
		Library library = new Library();
        library.borrowBooks("해리포터", "반지의 제왕", "데미안"); // 여러 권 대출
        library.returnBooks(1000, "1984", "파친코", "백년의 고독"); // 연체료와 책 목록 전달
        
        Hospital hospital = new Hospital();
        // public 메소드: 누구나 호출 가능
        hospital.emergencyCall();

        // protected, default, private 메소드는 직접 호출 불가
        // hospital.specialistConsultation(); // 컴파일 오류!
        // hospital.staffAnnouncement(); // 컴파일 오류!
        // hospital.personalMedicalRecord(); // 컴파일 오류!
        
        
        Hospital.hospitalInfo();
        Math.random();
	}
}
