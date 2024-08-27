package com.gn.study;
// 1. Scanner 사용하겠다.
import java.util.Scanner;

public class UseScanner {
	public static void main(String[] args) {
		// 2. Scanner 준비
		Scanner sc = new Scanner(System.in);
		
		// 3. 입력받기
		//sc.nextInt();		// int 타입 입력
		//sc.nextDouble();	// double 타입 입력
		//sc.nextBoolean();	// boolean 타입 입력
		//sc.next();			// String 타입 입력(공백 기준 한 단어)
		//sc.nextLine();		// String 타입 입력(개행 기준 한 줄)
	
		// * next()과 nextLine()
		System.out.print("숫자 : ");
		int menu = sc.nextInt();
		System.out.print("문자 : ");
		String text = sc.nextLine();
	}
}
