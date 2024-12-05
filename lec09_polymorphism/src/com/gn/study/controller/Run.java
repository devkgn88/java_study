package com.gn.study.controller;

import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.OrangeJuice;

public class Run {
	public static void main(String[] args) {
		int i_num = 3;
		double d_num = i_num;
		System.out.println(d_num);
		
		Beverage coffee = new Coffee();
		Beverage juice = new OrangeJuice();
		// 다형성에 따라 공통된 메소드를 호출
		coffee.drink();
		juice.drink();
		
		// 객체 배열 
		Beverage[] arr = new Beverage[3];
		arr[0] = new Beverage();
		arr[1] = new Coffee();
		arr[2] = new OrangeJuice();
		System.out.println("=== 음료수 주세요~! ===");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].drink();
		}
		
		// 다운캐스팅
		// coffee.ice();
		Coffee specialCoffee = (Coffee)coffee;
		specialCoffee.ice();
		
	}
}
