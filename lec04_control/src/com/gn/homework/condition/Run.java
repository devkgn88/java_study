package com.gn.homework.condition;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Practice p = new Practice();
		
		// 사용자에게 실행할 기능 선택 받기
        System.out.println("실행할 기능을 선택하세요.");
        System.out.println("1. 놀이동산 입장료 계산하기");
        System.out.println("2. 일기예보");
        System.out.println("3. 세개의 정수 비교하기");
        System.out.println("4. 철수네 공장");
        System.out.println("5. 헬스 마니아 철수");
        System.out.println("6. 합격인가? 불합격인가?");
        System.out.print("선택: ");
        int choice = sc.nextInt();
        
     // 선택에 따라 해당 기능 실행
        switch (choice) {
            case 1 : p.practice01(); break;
            case 2 : p.practice02(); break;
            case 3 : p.practice03(); break;
            case 4 : p.practice04(); break;
            case 5 : p.practice05(); break;
            case 6 : p.practice06(); break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
	}
}
