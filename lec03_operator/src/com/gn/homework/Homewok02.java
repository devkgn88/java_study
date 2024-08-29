package com.gn.homework;

import java.util.Scanner;

public class Homewok02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 구슬의 개수 입력받기
		System.out.print("구슬의 개수 : ");
		int beads = sc.nextInt();
		
		// 구슬의 홀수, 짝수 여부 판별
		String result = (beads % 2 == 0) ? "짝수" : "홀수";
		System.out.println("구슬의 개수는 " + result + "입니다.");
		
	}
}
