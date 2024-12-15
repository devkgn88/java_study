package com.gn.practice03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String input = sc.nextLine();
		
		String[] words = sentence.split(" ");
		boolean result = false;
		for (int i = 0; i < words.length; i++) {
            if (words[i].equals(input)) {
                result = true;
                // 마지막 단어 처리
                if (i == words.length - 1) {
                    System.out.println("마지막 단어입니다.");
                } else {
                    System.out.println(input + " 다음 단어: " + words[i + 1]);
                }
                break;
            }
        }
        if (!result) {
            System.out.println("존재하지 않는 단어입니다.");
        }
		
		sc.close();
	}
}
