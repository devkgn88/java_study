package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	 public static void main(String[] args) {
	        // Scanner 객체 생성
	        Scanner sc = new Scanner(System.in);

	        // 국어, 영어, 수학 점수 입력 받기
	        System.out.print("국어 : ");
	        double koreanScore = sc.nextDouble();

	        System.out.print("영어 : ");
	        double englishScore = sc.nextDouble();

	        System.out.print("수학 : ");
	        double mathScore = sc.nextDouble();

	        // 총점 계산
	        int totalScore = (int) (koreanScore + englishScore + mathScore);

	        // 평균 계산
	        int averageScore = totalScore / 3;

	        // 결과 출력
	        System.out.println("총점 : " + totalScore);
	        System.out.println("평균 : " + averageScore);
	}
}
