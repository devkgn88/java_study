package com.gn.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("한 자리 숫자를 입력하세요: ");
        char digitChar = sc.nextLine().charAt(0); // 문자열로부터 첫 번째 문자를 읽어옴

        // char 타입의 숫자값을 정수로 변환하여 계산
        int digit = digitChar - '0';
        int square = digit * digit;

        System.out.println("입력한 숫자의 제곱은 " + square + "입니다.");
        
	}
}
