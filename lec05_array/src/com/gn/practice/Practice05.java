package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		int[] scores = {54,23};
		Scanner sc = new Scanner(System.in);
		System.out.print("길동이 : ");
		int gildong = sc.nextInt();
		int[] score2 = new int[scores.length+1];
		for(int i = 0 ; i < scores.length ; i++) {
			score2[i] = scores[i];
		}
		score2[score2.length-1] = gildong;
		int sum = 0;
		for(int num : score2) {
			System.out.println(num);
			sum += num;
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/score2.length);
	}
}
