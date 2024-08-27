package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 가로 입력받기
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		// 세로 입력받기
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		// 면적 계산
		double area = width * height;
		// 둘레 계산
		double perimeter = (width + height)*2;
		System.out.println("면적 : "+area);
		System.out.println("둘레 : "+perimeter);
		
	}
}
