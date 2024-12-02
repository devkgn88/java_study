package com.gn.homework.two;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1.거꾸로 4x4 배열");
		System.out.println("2.랜덤 4x4 배열");
		System.out.println("3.알파벳 랜덤 2차원 배열");
		System.out.println("4.문장 출력하기");
		System.out.println("5.자리 배치하기");
		System.out.println("6.학생의 위치 출력");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		// 선택에 따라 해당 기능 실행
        switch(num) {
        	case 1:
        		// 거꾸로 4x4 배열
        		new Practice().practice01();
            break;
        	case 2:
        		// 랜덤 4x4 배열
        		new Practice().practice02();
            break;
        	case 3:
        		// 알파벳 랜덤 2차원 배열
        		new Practice().practice03();
            break;
        	case 4:
        		// 문장 출력하기
        		new Practice().practice04();
            break;
        	case 5:
        		// 자리 배치하기
        		new Practice().practice05();
            break;
        	case 6:
        		// 학생의 위치 출력
        		new Practice().practice06();
            break;
        	default:
        		System.out.println("잘못된 선택입니다.");
        }
        sc.close();
	}
}
