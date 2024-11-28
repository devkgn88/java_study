package com.gn.practice;

public class Practice01 {
	public static void main(String[] args) {
		String[] friends = new String[5];
		friends[0] = "박지영";
		friends[1] = "김태우";
		friends[2] = "이지훈";
		friends[3] = "최유진";
		friends[4] = "정승호";
		
		for (int i = 0; i < friends.length; i++) {
		    System.out.println((i+1) + ": " + friends[i]);
		}
	}
}
