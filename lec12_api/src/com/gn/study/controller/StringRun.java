package com.gn.study.controller;

import java.util.Collections;

public class StringRun {
	public static void main(String[] args) {
		// String 객체 생성
		String str = "Hello";

		// 초기 주소값 출력
		System.out.println("초기 주소값: " + System.identityHashCode(str));

		// 새로운 문자열을 추가하여 새로운 String 객체 생성
		str += ", World";

		// 변경 후 주소값 출력
		System.out.println("변경 후 주소값: " + System.identityHashCode(str));
		
		System.out.println("===== 문자열 리터럴 =====");
		String str1 = "my";
		System.out.println("str1 : "+System.identityHashCode(str1));
		String str2 = "my";
		System.out.println("str2 : "+System.identityHashCode(str2));
		
		String text = "hi hello hi";
		System.out.println(text.charAt(1));
		text="안녕. 나는 김가남이야. 호호";
		System.out.println("=== indexOf ===");
		System.out.println(text.indexOf("나는"));
		System.out.println(text.indexOf("없어"));
		System.out.println(text.indexOf("."));
		System.out.println("=== lastIndexOf ===");
		System.out.println(text.lastIndexOf("."));
		
		System.out.println("=== replace ===");
		String sentence ="System도 못해. String도 못해.";
		sentence = sentence.replace("못해", "잘해");
		System.out.println(sentence);
		
		String empty1 = new String("");
		String empty2 = new String(" ");
		System.out.println("=== isBlank() ===");
		System.out.println(empty1.isBlank());
		System.out.println(empty2.isBlank());
		System.out.println("=== isEmpty() ===");
		System.out.println(empty1.isEmpty());
		System.out.println(empty2.isEmpty());
		System.out.println("=== length() ===");
		System.out.println(empty1.length()==0);
		System.out.println(empty2.length()==0);
		
		System.out.println("=== join ===");
		String[] seasons = {"봄", "여름", "가을", "겨울"};
		String result = String.join("→", seasons);
		System.out.println(result);
		
		String cutTest =  "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0, 4)); 
		System.out.println(cutTest.substring(3,4));
		
		String original = "Hello World!";
		String upperCase = original.toUpperCase();
		System.out.println("대문자 변환: " + upperCase);
		String lowerCase = original.toLowerCase();
		System.out.println("소문자 변환: " + lowerCase);
		
	}
}
