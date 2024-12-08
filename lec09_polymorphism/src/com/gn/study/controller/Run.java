package com.gn.study.controller;

import com.gn.study.model.vo.Animal;
import com.gn.study.model.vo.Beverage;
import com.gn.study.model.vo.Cat;
import com.gn.study.model.vo.Coffee;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Earth;
import com.gn.study.model.vo.Mars;
import com.gn.study.model.vo.OrangeJuice;
import com.gn.study.model.vo.Planet;

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
		
		// 정적 바인딩
		Planet myPlanet = new Planet();
		myPlanet.description();
		myPlanet.description(46);
		
		// 동적 바인딩
		Planet p1 = new Earth();
		p1.material();
		Planet p2 = new Mars();
		p2.material();
		
		Animal dog = new Dog();
		Animal cat = new Cat();
        
        dog.makeSound(); // 멍멍!
        cat.makeSound(); // 야옹~
        cat.breath();
	}
}
