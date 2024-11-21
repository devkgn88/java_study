package com.gn.study;

public class VariableBasic {
	public static void main(String[] args) {
		// 1. 변수의 선언
		// 자료형 변수명;
		// 정수 : 소수점이 없는 숫자
		// 정수형 변수 number 선언하기
		int number;
		
		// 2. 변수의 초기화
		// 변수명 = 리터럴;
		number = 7;
		
		// 선언과 초기화 동시
		int age = 100;
		
		// 3. 변수 사용
		System.out.println(age);
		System.out.println("age");
		
		// 4. 변수의 할당과 재할당
		int score = 100;  
		score = 200;     
		System.out.println(score);
		
		// 5. 변수의 장점
		// 변수 사용 X
		System.out.println(2*3.141592653589793*10);
		System.out.println(3.141592653589793*10*10);
		System.out.println(3.14653589792*10*10*20);
		System.out.println(3.141592653589793*30);
		
		// 변수 사용 O
		double pi = 3.141592653589793;
		int r = 10;
		System.out.println(2*pi*r);
		System.out.println(pi*r*r);
		System.out.println(pi*r*r*20);
		System.out.println(pi*30);
		
		// 6. 변수명
		// int int;
		int n_int;
		
		//int a = 29;
		int today = 7;
		
	}
}
