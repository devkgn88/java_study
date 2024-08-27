package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자 입력받기
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.nextLine().charAt(0);
		
		// 문자의 유니코드 출력
        int unicode = (int) inputChar;
        System.out.println(inputChar + "의 유니코드 : " + unicode);

	}
}
