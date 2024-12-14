package com.gn.study.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[3];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("문자열("+(i+1)+"):");
			arr[i] = sc.nextLine();
		}
		
		String result = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(result.length() < arr[i].length()) {
				result = arr[i];
			}else if(result.length() == arr[i].length()) {
				if(result.compareTo(arr[i]) < 0) {
					result = arr[i];
				}
			}
		}
		
		System.out.println(result.concat(result));
		sc.close();
	}
}
