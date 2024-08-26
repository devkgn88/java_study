package com.gn.study;

public class DataType {
	 public static void main(String[] args) {
		// 1. 기본형
		// 정수형 변수
		byte b_num = 1;
		short s_num = 23;
		int i_num = 456;
		long l_num = 7890;
		// 실수형 변수
		float f_num = 1.23f;
		double d_num = 4.567;
		// 문자형 변수
		// 문자 하나, 홑따옴표
		char grade = 'A';
		// char gender = 'Female';
		// 논리형 변수
		boolean isStudent = true;
		
		// 2. 참조형
		int num = 10;
		String name = null;
		
		// 문자열
		// 1. 문자열 초기화
		String str1 = new String("감사");
		String str2 = "감사";
		String str3 = "감사"+"합니다";
		String str4 = new String("감사"+"합니다");
		String str5 = "감사"+100+"합니다";
		String str6 = 100+"감사합니다";
		
		// 2. 기본형과 비교
		int num1 = 2;
		int num2 = 2;
		System.out.println("기본형 : "+(num1 == num2));
		
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println("참조형 : "+(text1 == text2));
		
		// 3. 문자열 사용
		// 표준출력
		String status = "최종";
		System.out.println(status);
		// 재할당
		status = new String("진짜 최종");
		System.out.println(status);
		// 다른 변수로 재할당
		String real = "이거진짜찐최종";
		status = real;
		System.out.println(status);

		// 4. charAt(n)
		String word = "Hello";
		char firstLetter = word.charAt(0);  // 'H'
		char secondLetter = word.charAt(1); // 'e'	
		 
	}
}
