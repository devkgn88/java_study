package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 몸무게 입력받기
		System.out.print("몸무게(kg) : ");
		double weight = sc.nextDouble();
		
		// 키 입력받기
		System.out.print("키(m) : ");
		double height = sc.nextDouble();
		
		// BMI 계산
		double bmi = weight / (height * height);
		
		// 결과 출력 
		System.out.printf("BMI 지수 : %.1f", bmi);
		
	}

}
