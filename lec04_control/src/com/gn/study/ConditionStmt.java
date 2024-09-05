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
	}
}
