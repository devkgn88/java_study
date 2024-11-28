package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	// 1. 놀이동산 입장료 계산하기
	public void practice01() {
		System.out.println("=== 놀이동상 입장료 계산하기===");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int fee;
		
		if (age < 3) {
            fee = 0;
        } else if (age >= 3 && age <= 12) {
            fee = 10000;
        } else if (age >= 13 && age <= 18) {
            fee = 20000;
        } else if (age >= 19 && age <= 64) {
            fee = 30000;
        } else {
            fee = 0;
        }
		System.out.println("당신의 놀이동산 요금은 " + fee + "원입니다.");
	}
	
	// 2. 일기예보
	public void practice02() {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
        int month = sc.nextInt();
        
        System.out.print("기온 : ");
        int temperature = sc.nextInt();
        
        String season = "";
        
        if (month == 1 || month == 2 || month == 12) {
        	season = "겨울";
        	if(temperature <= -15) {
        		season += " 한파 경보";
        	} else if(temperature <= -12) {
        		season += " 한파 주의보";
        	}
        } else if (month >= 3 && month <= 5) {
        	season = "봄";
        } else if (month >= 6 && month <= 8) {
        	season = "여름";
        	if(temperature >= 35) {
        		season += " 폭염 경보";
        	} else if(temperature >= 33) {
        		season += " 폭염 주의보";
        	}
        } else if (month >= 9 && month <= 11) {
        	season = "가을";
        } else {
        	season = "해당하는 계절이 없습니다.";
        }
     
        System.out.println(season);
	}
	
	// 3. 세개의 정수 비교하기
	public void practice03(){
		System.out.println("=== 세개의 정수 비교하기 ===");
		Scanner sc = new Scanner(System.in);
		
		// 세개의 정수 입력받기
		System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수 : ");
        int num3 = sc.nextInt();
        
        // 삼항 연산자를 사용하여 세 수 중에서 최소값을 찾기
        int minNumber = (num1 < num2) ? 
								        ((num1 < num3) ? num1 : num3) : 
								        ((num2 < num3) ? num2 : num3);

        // 결과 출력
        System.out.println("세 수 중에서 가장 작은 수는 " 
						        + minNumber+"입니다.");

	}
	
	// 4. 철수네 공장
	public void practice04(){
		System.out.println("=== 철수네 공장 ===");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수집된 코드 : ");
		int errorCode = sc.nextInt();
		
		switch (errorCode) {
	        case 400:
	            System.out.println("잘못된 요청입니다.");
	            break;
	        case 404:
	            System.out.println("요청하신 서비스를 찾을 수 없습니다.");
	            break;
	        case 500:
	            System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
	            break;
	        case 503:
	            System.out.println("일시적인 서버 오류가 발생하였습니다.");
	            break;
	        default:
	            System.out.println("알 수 없는 오류가 발생하였습니다.");
	            break;
		}
	}
	
	// 5. 헬스 마니아 철수
	public void practice05() {
		System.out.println("=== 헬스 마니아 철수 ===");
		Scanner sc = new Scanner(System.in);
        System.out.println("1. 스쿼트");
        System.out.println("2. 데드리프트");
        System.out.println("3. 벤치 프레스");
        System.out.println("4. 풀업");
        System.out.println("5. 종료");

        int choice = sc.nextInt();

        if (choice == 5) {
            System.out.println("오늘도 수고하셨습니다.");
        } else if (choice <= 0) {
            System.out.println("양수만 입력해주세요.");
        } else if (choice > 5) {
            System.out.println("목록에 있는 숫자만 입력해주세요.");
        } else {
            String exercise = "";
            if (choice == 1) {
                exercise = "스쿼트";
            } else if (choice == 2) {
                exercise = "데드리프트";
            } else if (choice == 3) {
                exercise = "벤치 프레스";
            } else if (choice == 4) {
                exercise = "풀업";
            }
            System.out.println(exercise + " 운동 시간입니다.");
        }
	}
	
	// 6. 합격인가 불합격인가
	public void practice06() {
		System.out.println("=== 합격인가? 불합격인가? ===");
		Scanner sc = new Scanner(System.in);

	    System.out.println("각 과목의 점수를 입력하세요.");

        System.out.print("소프트웨어설계 점수: ");
        int softwareDesign = sc.nextInt();

        System.out.print("소프트웨어개발 점수: ");
        int softwareDevelopment = sc.nextInt();

        System.out.print("데이터베이스구축 점수: ");
        int databaseConstruction = sc.nextInt();

        System.out.print("프로그래밍언어활용 점수: ");
        int programmingLanguage = sc.nextInt();

        System.out.print("정보시스템구축관리 점수: ");
        int systemManagement = sc.nextInt();

        int totalScore = softwareDesign 
	        + softwareDevelopment 
	        + databaseConstruction 
	        + programmingLanguage 
	        + systemManagement;
        double averageScore = totalScore / 5.0;

        if (softwareDesign < 40) {
            System.out.println("소프트웨어설계 과목 과락으로 불합격");
        } else if (softwareDevelopment < 40) {
            System.out.println("소프트웨어개발 과목 과락으로 불합격");
        } else if (databaseConstruction < 40) {
            System.out.println("데이터베이스구축 과목 과락으로 불합격");
        } else if (programmingLanguage < 40) {
            System.out.println("프로그래밍언어활용 과목 과락으로 불합격");
        } else if (systemManagement < 40) {
            System.out.println("정보시스템구축관리 과목 과락으로 불합격");
        } else if (averageScore >= 60) {
            System.out.println("합격을 축하합니다!");
        } else {
            System.out.println("평균 점수 60점 미만으로 불합격");
        }
	}
}
