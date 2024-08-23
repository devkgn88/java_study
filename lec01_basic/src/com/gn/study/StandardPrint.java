package com.gn.study;

public class StandardPrint {
	public static void main(String[] args) {
		// 표준출력(1) 
		System.out.print("Hello World");
		System.out.print(123);
		// 표준출력(2)
		System.out.println("Hello World");
		System.out.println(123);
		// 표준출력(3)
		System.out.printf("숫자: %d", 10);
		System.out.printf("실수: %.2f", 3.14159);
		System.out.printf("이름: %s", "홍길동");
		// 주의사항
		System.out.printf("이름: %s, 나이: %d, 키: %.1fcm", "김철수", 25, 179.86);
		
	}
}
