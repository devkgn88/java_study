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
	}
}
