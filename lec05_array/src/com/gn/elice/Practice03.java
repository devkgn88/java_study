package com.gn.elice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int origin = sc.nextInt();
//		if(origin / 10 == 0) {
//			System.out.println("대칭수아님");
//			return;
//		}
		int num = origin;
		int cnt = 0; 
	    while(origin > 0){
	        origin /= 10; 
	        cnt++;
	    }
	    int[] arr = new int[cnt];
	    for(int i = 0 ; i < arr.length ; i++) {
	    	arr[i] = num % 10;
	    	num /= 10;
	    }
	    
	    int[] check = new int[cnt];
	    for(int i = arr.length-1 ; i >= 0 ; i--) {
	    	// 4 -> 0
	    	// 3 -> 1
	    	// 2 -> 2
	    	// 1 -> 3
	    	check[i] = arr[cnt-1-i];
	    }
	    
	    int result = 0;
	    for(int i = 0 ; i < arr.length; i++) {
	    	if(arr[i] == check[i]) {
	    		result++;
	    	}
	    }
	    if(result == cnt) {
	    	System.out.println("대칭수");
	    } else {
	    	System.out.println("대칭수아님");
	    }
	    
//	    int check = 0;
//	    for(int i = 0 ; i < arr.length/2 ; i++) {
//	    	if(arr[i] == arr[arr.length-1-i]) {
//	    		check++;
//	    	}
//	    }
//	    if(check != 0 )
	    
	}
}
