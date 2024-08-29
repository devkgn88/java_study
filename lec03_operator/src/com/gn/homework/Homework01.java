package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		// Scanner 객체
		Scanner sc = new Scanner(System.in);
		
		// 데이터 입력받기
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
		
		// 삼항연산자 이용
		// 반대의 단어 출력
		String output = input.equals("간다") ? "온다" : "간다";
		
		// 결과 출력
		System.out.println("앵무새 : "+output);
		
	}
}
