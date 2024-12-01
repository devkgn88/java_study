package com.gn.study;

public class DimensionalArray {
	public static void main(String[] args) {
		// 1. 배열의 선언
		int[] intArr;
		String[] names;
		// 2. 배열의 생성
		int[] scores;
		scores = new int[4];
		int[] heights = new int[10];
		// 3. 배열의 길이
		int[] numArr = new int[3];
		// 4. 배열의 초기화
		int[] arr = new int[2];
		System.out.println(arr[1]);
		boolean[] arr2 = new boolean[3];
		System.out.println(arr2[2]);
		// (1) 인덱스를 이용한 초기화
		int[] age1 = new int[3];
		age1[0] = 30;
		age1[1] = 20;
		age1[2] = 70;
		// (2) 반복문을 이용한 초기화
		int[] age2 = new int[3];
		for(int i= 0 ; i < age2.length ; i++){
			age2[i] = i+10;
			// 만약 규칙이 없다면...
			if(i == 0){
				age2[i] = 345;
			}
		}
		
		
		
	}
}
