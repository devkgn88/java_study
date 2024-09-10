package com.gn.study;

public class ConditionStmt {
	public static void main(String[] args) {
		// if문
		int number = 3;
		if(number > 5) {
			System.out.println("number는 5보다 큽니다.");
		}
		// 블록
	    int su = 5;  
	    if(su > 3){    
	        int num = 2;    
	        System.out.println(su);    
	        System.out.println(num);  
	    }
	    // 오류 발생
	    // System.out.println(num);
	    
	    // if~else
	    int num= -3;

		// 입력한 숫자가 양수인지 음수인지 판별
		if(num > 0){
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수,또는 0입니다.");
		}
		
		// if~else if~else
		int a = 50;
		if(a >= 9) {
			// 9보다 크거나 같은 수
			System.out.println("9이상");
		} else if(a >= 6) {
			// 9보다 작은 수 중에서 6보다 크거나 같은 수
			System.out.println("6,7,8");
		} else if(a >= 3) {
			// 9보다 작고, 6보다 작은 수 중에서
			// 3보다 크거나 같은 수
			System.out.println("3,4,5");
		} else {
			// 9보다 작고, 6보다 작고, 3보다 작은 수
			System.out.println("3미만");
		}
		
		// 중첩 if문
		int target = -5;
		if(target > 0) {
			System.out.println("양수입니다.");
			if(target % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
				if(target % 3 == 0) {
					System.out.println("3의 배수");
				}
			}	
		} else if(target < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		// switch문
		int day = 2;
		System.out.println("해당 요일은 : ");
		switch(day) {
		 case 0 : System.out.println("일요일"); break;
		 case 1 : System.out.println("월요일"); break;
		 case 2 : System.out.println("화요일"); break;
		 case 3 : System.out.println("수요일"); break;
		 case 4 : System.out.println("목요일"); break;
		 case 5 : System.out.println("금요일"); break;
		 case 6 : System.out.println("토요일"); break;
		 default : System.out.println("잘못된 숫자입니다.");break;
		}

		int month = 7;
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 : System.out.println("31일까지"); break;
			case 4 : case 6 : case 9 : case 11 : System.out.println("30일까지"); break;
			case 2 : System.out.println("28일까지"); break;
			default : System.out.println("존재하지 않는 달입니다."); break;
		}
		
	}
}
