package com.gn.homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result  = "";
		while(true) {
			System.out.print("문자열 : ");
			String input = sc.nextLine();
			if (input.toUpperCase().equals("N")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
            	result += input;
            }
			
		}
		System.out.println("최종 문자열 : " + result);
		sc.close();
	}
}
