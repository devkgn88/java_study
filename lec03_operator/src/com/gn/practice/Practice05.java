package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		boolean bool1 = 50 <= age;
		boolean bool2 = age <= 59;
		boolean result = bool1 && bool2;
		
		System.out.println(result);
	}
}
