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
		
		
	}
}
