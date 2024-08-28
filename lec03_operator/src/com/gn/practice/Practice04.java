package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String realNickName = "Chulsu";
		System.out.print("닉네임 : ");
		String inputNickName = sc.nextLine();
		boolean result = (realNickName == inputNickName);
		System.out.println("닉네임이 일치하나요? "+result);
	}
}
