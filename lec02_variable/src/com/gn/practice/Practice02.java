package com.gn.practice;

public class Practice02 {
	
	public static void main(String[] args) {
		boolean hasUmbrella = true;
		char favoriteAlphabet = 'G';
		double month = 10;
		int today = 26;
		System.out.printf("안녕하세요 오늘은 %.0f월 %d일이에요."
				+ "\n저는 알파벳 %c을 제일 좋아해요."
				+ "\n오늘의 우산 상태는 %b에요",month,today,favoriteAlphabet,hasUmbrella);
	}

}
