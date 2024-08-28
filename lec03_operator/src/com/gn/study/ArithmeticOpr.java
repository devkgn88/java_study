package com.gn.study;

public class ArithmeticOpr {
	public static void main(String[] args) {
		// 1. 연산의 개념
		int num1 = 5; // 피연산자(1)
		int num2 = 3; // 피연산자(2)
		// 덧셈 연산자를 사용하여 피연산자 num1과 num2를 더함
		int result = num1 + num2; 
		
		// 2. 산술 연산자
		int su1 = 10;
		int su2 = 3;
		// difference에는 10 - 3 = 7이 저장
		int diff = su1 - su2; 
		// product에는 10 * 3 = 30이 저장
		int prod = su1 * su2;
		// quotient에는 10을 3으로 나눈 몫인 3이 저장
		int quot = su1 / su2;
		// remainder에는 10을 3으로 나눈 나머지인 1이 저장
		int rem = su1 % su2;
		
		// 3. 연산자 우선순위
		System.out.println(1 + 2 * 3);
		System.out.println((1+2)*3);
		System.out.println(1+(2*3));
		
		// 4. 대입연산자
		int x = 5;
		int y = x;
		System.out.println(y);

		// 대입 연산을 수행할때 자료형 주의!!
		//int i_num = 3.14;
		double d_num = 3.14;
		
		// 5. 복합 대입 연산자
		int a = 5;
		a += 3; // a = a + 3과 동일, a는 8
		System.out.println(a);
		
		int b = 10;
		b -= 4; // b = b - 4와 동일, b는 6
		
		int c = 10;
		c *= 5; // c = c * 5 와 동일, c는 50
		
		int d = 10;
		d /= 3; // d = d % 3과 동일, d는 3
		
		int e = 10;
		e %= 3; // e = e % 3과 동일,e는 1
	}
}
