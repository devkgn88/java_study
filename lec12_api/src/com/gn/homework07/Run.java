package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1; 
        int count = 0; 

        System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int guess = scanner.nextInt();
            count++;

            if (guess < randomNumber) {
                System.out.println("UP !");
            } else if (guess > randomNumber) {
                System.out.println("DOWN !");
            } else {
                System.out.println("정답입니다 !!");
                break;
            }
        }

        System.out.println(count + "회만에 맞추셨습니다.");
        scanner.close();
	}
}
