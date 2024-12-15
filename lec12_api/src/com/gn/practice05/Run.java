package com.gn.practice05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "The qUick broWN fOx jumpS oVeR The lazY doG";		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		int num = sentence.toLowerCase().indexOf(str.toLowerCase());
		if( num != -1) {
			
			if(num+str.length() == sentence.length()) {
				System.out.println("마지막 단어 입니다.");
			} else {
				String result = sentence.substring(num, num+str.length());
				System.out.println("뒷 단어 : "+result);
			}

		}else {
			System.out.println("존재하지 않는 단어입니다.");
		}
		
		sc.close();
	}
}
