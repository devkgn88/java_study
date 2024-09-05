package com.gn.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		int check;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		check = sc.nextInt();
		if(check % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
