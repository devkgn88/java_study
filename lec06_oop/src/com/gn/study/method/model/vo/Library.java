package com.gn.study.method.model.vo;

public class Library {
	// 가변인자 매개변수를 사용한 메소드 
	public void borrowBooks(String...books) {
		System.out.println("===== 대출할 책 목록 =====");
		for(String book : books) {
			System.out.println("- "+book);
		}
	}
	
	// 가변인자 매개변수와 다른 매개변수 함께 사요 
	public void returnBooks(int lateFee, String...books) {
        System.out.println("총 연체료: " + lateFee + "원");
        System.out.println("===== 반납할 책 목록 =====");
		for(String book : books) {
			System.out.println("- "+book);
		}
	}
}
