package com.gn.study.controller;

public class MathRun {
	public static void main(String[] args) {
		int num = -37;
		num = Math.abs(num);
		// num = num < 0 ? -num : num;
		System.out.println(num);
		double dNum = Math.pow(5,2);
		System.out.println(dNum);
		//반올림
		double pi = 3.64159265;
		System.out.println(Math.round(pi));
		// 세번째까지 반올림하기
		// 1. 원하는 자리수만큼 10의 지수 곱하기
		double multiple = pi*1000;
		System.out.println(multiple);
		// 2. 반올림하기
		long half = Math.round(multiple);
		System.out.println(half);
		// 3. 10의 지수 실수만큼 나누기
		double divide = half/1000.0;
		System.out.println(divide);
		// 정리
		double after = Math.round(pi*1000)/1000.0; 
		System.out.println(after);
		double powNum = Math.pow(10, 3);
		after = Math.round(pi*powNum)/powNum;
		System.out.println(after);
		
		
		double up = Math.ceil(pi);
		System.out.println(up);
		double down = Math.floor(pi);
		System.out.println(down);
		System.out.println(Math.ceil(1/2));
		System.out.println(Math.ceil(1.0/2.0));
	}
}
