package com.gn.study;

public class IncrementOpr {
	public static void main(String[] args) {
		// 1. 전위 증감 연산자
		int pre = 5;
		// 전위 증가 연산자를 사용하여 변수를 증가시키고 출력
		System.out.println("=== 전위 증가 연산자 사용 ===");
		// 현재 수 출력
		System.out.println("1 : " + pre); 
		// 증가 후의 수 출력
		System.out.println("2 : " + ++pre); 
		// 증가 후의 현재 수 출력
		System.out.println("3 : " + pre); 
		
		// 2. 후위 증감 연산자
		int post = 5;
		// 후위 증가 연산자를 사용하여 변수를 증가시키고 출력
		System.out.println("=== 후위 증가 연산자 사용 ===");
		// 현재 수 출력
		System.out.println("1 : " + post); 
		// 증가 후의 수 출력
		System.out.println("2 : " + post++);
		// 증가 후의 현재 수 출력
		System.out.println("3 : " + post);
		
		// 초기화
		int a = 2, b = 0;
		System.out.println("최초 a : "+a);
		System.out.println("최초 b : "+b);

		// 전위 증가 연산
		// 1. a = a + 1;
		// 2. b = a;
		b = ++a;
		System.out.println("전위 연산 실행 후 a : "+a);
		System.out.println("전위 연산 실행 후 b : "+b);
		
		// 초기화
		int x = 2, y = 0;
		System.out.println("최초 x : "+x);
		System.out.println("최초 y : "+y);

		// 후위 증가 연산
		// 1. y = x;
		// 2. x = x + 1;
		y = x++;
		System.out.println("후위 연산 실행 후 x : "+x);
		System.out.println("후위 연산 실행 후 y : "+y);
	}
}
