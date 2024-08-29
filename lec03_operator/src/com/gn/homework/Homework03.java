package com.gn.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 친구의 인원수
		System.out.print("친구 수 : ");
        int friends = sc.nextInt();
        // 사탕의 개수
        System.out.print("사탕의 수 : ");
        int candies = sc.nextInt();
        
        // 친구 한명당 나눠줄 수 있는 사탕의 최대개수
        int candiesPerFriend = candies / friends;
        
        // 나눠주고 남은 사탕의 수
        int remainingCandies = candies % friends;
        
        // 출력
        System.out.println("1인당 사탕 개수 : " + candiesPerFriend+"개");
        System.out.println("남는 사탕 개수 : " + remainingCandies+"개");
        
	}
}
