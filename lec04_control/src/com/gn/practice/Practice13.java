package com.gn.practice;

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		for(int i = 0 ; i < msg.length() ; i++) {
			char ch = msg.charAt(i);
            // 공백일 경우 다음 문자로 넘어감
            if (ch == ' ') {
                continue;
            }
            System.out.print(ch);
		}
	}
}
