package com.gn.study;

public class Arithmetic {
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
	}
}
