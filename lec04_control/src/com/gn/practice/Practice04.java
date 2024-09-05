package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(F/M) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("머리(cm) : ");
		int hair = sc.nextInt();

		if('F'== gender) {
			//여성
			if(hair <= 7) System.out.println("합격입니다.");
			else System.out.println("불합격입니다.");
		} else {
			//남성
			if(hair <= 3) System.out.println("합격입니다.");
			else System.out.println("불합격입니다.");
		}
		
//		boolean isPass = false;
//		if("F".equals(gender)) {
//			// 여성
//			if(hair <= 7) {
////				System.out.println("합격입니다.");
//				isPass = true;
//			} 
////			else {
////				System.out.println("불합격입니다.");
//// 				isPass = false;
////			}
//		} else if("M".equals(gender)) {
//			// 남성
//			if(hair <= 3) {
////				System.out.println("합격입니다.");
//				isPass = true;
//			} 
////			else {
////				System.out.println("불합격입니다.");
//// 				isPass = false;
////			}
//		} else {
//			// 알 수 없음
//			System.out.println("알 수 없는 성별입니다.");
//// 			isPass = false;
//		}
//	
//		if(isPass == true) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}
	}
}