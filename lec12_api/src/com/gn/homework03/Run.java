package com.gn.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        email = email.trim();

        String domain = "@goodee.co.kr";
        int idx = email.lastIndexOf('@');
        if (idx == -1 || !email.substring(idx).equals(domain)) {
            System.out.println("유효하지 않은 이메일입니다.");
        } else {
            String userId = email.substring(0, idx).toUpperCase();
            System.out.println("아이디: " + userId);
        }

        sc.close();
	}
}
