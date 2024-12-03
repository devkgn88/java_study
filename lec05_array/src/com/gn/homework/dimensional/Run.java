package com.gn.homework.dimensional;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 실행할 기능 선택 받기
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 키 순서대로 앉으세요.");
		System.out.println("2. 값 입력받아 배열 만들기");
		System.out.println("3. 올라갔다 내려갔다");
		System.out.println("4. 로또 번호 자동 생성기");
		System.out.println("5. 컴퓨터와 가위바위보");
		System.out.println("6. 배열 늘리기");
		System.out.println("7. 문서 복사하기");
		System.out.println("8. 오늘의 메뉴판 만들기");
		System.out.print("선택: ");
        int choice = sc.nextInt();
        
        // 선택에 따라 해당 기능 실행
        switch(choice) {
        	case 1:
        		// 키 순서대로 앉으세요.
        		new Practice().practice01();
            break;
        	case 2:
        		// 값 입력받아 배열 만들기
        		new Practice().practice02();
            break;
        case 3:
            // 올라갔다 내려갔다
        	new Practice().practice03();
            break;
        case 4:
            // 로또 번호 자동 생성기
        	new Practice().practice04();
            break;
        case 5:
            // 컴퓨터와 가위바위보
        	new Practice().practice05();
            break;
        case 6:
            // 배열 늘리기
        	new Practice().practice06();
            break;
        case 7:
        	// 문서 복사하기
        	new Practice().practice07();
        	break;
        case 8:
        	// 오늘의 메뉴판 만들기
        	new Practice().practice08();
        	break;
        default:
            System.out.println("잘못된 선택입니다.");
        }
        sc.close();
	}

}
