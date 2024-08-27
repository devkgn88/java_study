package com.gn.study;

public class TypeCasting {
	public static void main(String[] args) {
		// 업캐스팅(1) 
		int a = 23;
		double b = a;
		System.out.println(b);
		// 업캐스팅(2) 
		int c = 3;
		double d = 20.5;
		System.out.println(c+d);
		
		// 문자 형변환
		// 할당
		char test = 'a';
		int num = test;
		System.out.println(num);
		
		// 연산
		int e = 50;
		char f = '2';
		System.out.println(e+f);
		
		// 활용
		System.out.println(f-'0');
		
		// 업캐스팅
		double d_num = 13.4;
		int i_num = 4;
		System.out.println(d_num+i_num);
		System.out.println((int)d_num+i_num);
		
		// 상수
		
		final double PI;
		PI = 2.14;
		// PI = 2.14;
		System.out.println(PI*10*2);
		final int MAX_SIZE = 100;
		
	
	}
}
