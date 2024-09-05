package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		String grade;
		if(90 < score) {
			//System.out.println("당신의 학점은 A입니다.");
			grade = "A";
		} else if(80 < score) {
			// 80 < score <= 90
			//System.out.println("당신의 학점은 B입니다.");
			grade = "B";
		} else if(70 < score) {
			// 70 < score <= 80
			//System.out.println("당신의 학점은 C입니다.");
			grade = "C";
		} else if(60 < score) {
			// 60 < score <= 70
			//System.out.println("당신의 학점은 D입니다.");
			grade = "D";
		} else {
			// score <= 60
			//System.out.println("당신의 학점은 F입니다.");
			grade = "F";
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
		sc.close();
	}
	
}
