package com.gn.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("true 또는 false 입력 : ");
		boolean kind = sc.nextBoolean();
		System.out.println("반대로 하면? "+!kind);
	}
}
