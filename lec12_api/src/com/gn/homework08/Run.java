package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 사용자로부터 숫자와 제곱수를 입력받음
        System.out.print("소수점이 있는 숫자: ");
        double number = scanner.nextDouble();

        System.out.print("10의 제곱수: ");
        int power = scanner.nextInt();

        double roundedNumber = Math.round(number * Math.pow(10, power)) / Math.pow(10, power);
        System.out.println("반올림된 결과: " + roundedNumber);

        scanner.close();
	}
}
