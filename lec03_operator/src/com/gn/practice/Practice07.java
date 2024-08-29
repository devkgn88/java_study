package com.gn.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		
		int min = (num1 < num2) ? num1 : num2;
		
		System.out.println("두 수 중에서 작은 수는? "+min);
	}
}	
