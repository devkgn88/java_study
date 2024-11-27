package com.gn.study;

public class LoopStmt {
	public static void main(String[] args) {
		// 1. for문
//		for (int i = 1; i <= 10; i++) {
//		    System.out.println(i);
//		}
		
		// 2. 초기식 생략
//		int i = 1; // 초기식 생략
//		for (; i <= 5; i++) {
//		    System.out.println(i);
//		}
		
		// 무한루프
//		for (int i= 1; ; i++) { // 조건식 생략
//			System.out.println(i);
//		}
		
		// 3. break
//		for (int i= 1; ; i++) { // 조건식 생략
//			System.out.println(i);
//			if(i >= 10){
//				break;
//			}
//		}
		
		// 4. 증감식 생략
		// 무한루프 발생 주의
//		for(int i = 1 ; i <= 10 ; ) {
//			System.out.println(i);
//		 	i = (++i) % 2;
//		}	
		
		int target = 10;
		int count = 0;

		// target 변수가 0보다 큰 경우에만 반복
		// target이 0보다 작아질 때까지 count 더하기
		for (; target > 0; ) {
		    count++;
		    target -= count;
		}

		System.out.println("최종 count 값: " + count);
		
		for(int i = 1 ; i <= 2 ; i++) {
			System.out.println("A");
			for(int j = 1 ; j <= 3 ; j++) {
				System.out.println("B");
			}
			System.out.println("C");
		}
		
		System.out.println("===== 별찍기 ======");
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
