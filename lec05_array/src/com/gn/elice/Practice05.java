package com.gn.elice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
	    int[] coin = { 500, 100, 50, 10, 5, 1 };
	    int[] cnt = { 5, 5, 5, 5, 5, 5 };
	    int[] result = new int[coin.length];
	    
	    Scanner sc = new Scanner(System.in);
	    int money = sc.nextInt();
	    
	    
	    
//	    int sum = 0;
//	    
//	    for(int i = 0 ; i < coin.length ; i++) {
//	    	sum += coin[i]*cnt[i];
//	    }
//	    System.out.println(sum);
	    
	    for(int i = 0 ; i < coin.length ; i++) {
	    	int num = money / coin[i];
	    	if(num > cnt[i]) {
	    		result[i] = cnt[i];
	    		money -= cnt[i]*coin[i];
	    	} else {
	    		
	    		result[i] = num;
	    		money -= num * coin[i];
	    	}
	    }
//	    System.out.println(money);
//	    for(int c : result) {
//	    	System.out.println(c);
//	    }
	    if(money != 0) {
	    	System.out.println("동전이 부족합니다.");
	    } else{
	    	for(int i = 0 ; i < coin.length ; i++) {
	    		System.out.println(coin[i]+"원:"+result[i]);
	    	}
	    	for(int i = 0 ; i < coin.length ; i++) {
	    		System.out.println("남은 동전 "+coin[i]+"원:"+(cnt[i]-result[i])+"개");
	    	}
	    }
	}
}
