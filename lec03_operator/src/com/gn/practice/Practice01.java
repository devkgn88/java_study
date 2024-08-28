package com.gn.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력 받기
        System.out.print("첫번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자: ");
        int num2 = sc.nextInt();

        // 덧셈
        int sum = num1 + num2;
        System.out.println("덧셈 : " + sum);

        // 뺄셈
        int diff = num1 - num2;
        System.out.println("뺄셈 : " + diff);

        // 곱셈
        int prod = num1 * num2;
        System.out.println("곱셈 : " + prod);

        // 나눗셈
        int quot = num1 / num2;
        System.out.println("몫 : " + quot);

        // 나머지
        int rem = num1 % num2;
        System.out.println("나머지 : " + rem);

	}
}
