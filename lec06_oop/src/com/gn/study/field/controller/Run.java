package com.gn.study.field.controller;

import com.gn.study.field.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		// 1. 필드 이용
		Car c1 = new Car();
		//c1.name = "소방차";
		System.out.println(c1.name);
		// 2. static 예약어
		Car c2 = new Car();
		Car c3 = new Car();
		// 인스턴스 c2의 brand 값 지정
		c2.brand = "Hyundai";
		// 인스턴스 c2과 c3의 brand값 모두 변경
		System.out.println("c2 : "+c2.brand);
		System.out.println("c3 : "+c3.brand);
		
		
	}
}
