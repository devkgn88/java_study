package com.gn.study.basic.controller;

import com.gn.study.basic.model.vo.Car;
// import java.util.Scanner;
import java.util.*;

public class CarController {
	public static void main(String[] args) {
		// 1. 참조변수 선언
		Car c1;
		// 2. 객체 생성
		// 객체의 주소를 참조 변수에 저장
		c1 = new Car();
		// 3. 동시 진행 가능 
		Car c2 = new Car();
		String str = new String();
		
		// 4. import문 없이 Car 가져오기
		com.gn.study.basic.model.vo.Car c3
			= new com.gn.study.basic.model.vo.Car();
		
		Car c4 = new Car();
		
		// 5. 클래스명은 같지만 패키지는 다른 클래스 import
//		com.gn.study.field.model.vo.Car c5 
//			= new com.gn.study.field.model.vo.Car();
//		
		// 6. * 와일드 카드 사용
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
	}
}
