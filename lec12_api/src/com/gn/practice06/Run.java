package com.gn.practice06;

public class Run {

	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		String sentence = String.join(" ", words);
		System.out.println("문장 : "+sentence);
		String result = "";
		for(int i = 1 ; i < words.length ; i++) {
			result += words[i].substring(0,1).toUpperCase();
		}
		System.out.println(result);
	}

}
