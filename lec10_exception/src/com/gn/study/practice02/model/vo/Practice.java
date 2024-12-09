package com.gn.study.practice02.model.vo;

public class Practice {
	public void printStrLength(String str) {
        try {
            // null인 문자열의 길이를 출력하려고 시도
            int length = str.length();
            System.out.println("문자열의 길이: " + length);
        } catch (NullPointerException e) {
            // NullPointerException이 발생하면 예외를 처리
//            System.out.println("NullPointerException 발생: " + e.getMessage());
        	System.out.println(e);
        }
	}
}
