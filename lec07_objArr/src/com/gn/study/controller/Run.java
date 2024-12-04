package com.gn.study.controller;

import com.gn.study.model.vo.Academy;

public class Run {
	public static void main(String[] args) {
		// 1. 선언
		Academy[] arr1;
		
		// 2. 생성
		// (1) 선언 후 생성
		arr1 = new Academy[2];
		// (2) 선언과 동시 생성
		Academy[] arr2 = new Academy[4];
		
		// 3. 초기화
		// (1) 인덱스를 이용한 초기화
		Academy[] arr3 = new Academy[2];
		arr3[0] = new Academy("가남 교육원","010-111-1111");
		arr3[1] = new Academy("나남 교육원","010-222-2222");
		
		// (2) 선언과 동시에 초기화
		Academy[] arr4 = { 
				new Academy("다담 교육원","010-555"),
				new Academy("라람 교육원","010-666"),
				new Academy("마맘 교육원","010-777")};
		
		// 4. 출력
		// (1) 인덱스를 이용한 출력
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[0].getName());
		System.out.println(arr3[1].getPhone());
		
		// (2) for문을 이용한 출력
		for(int i = 0 ; i < arr4.length ; i++) {
			System.out.println(i+" : "+arr4[i]);
			System.out.println("이름 : "+arr4[i].getName());
		}
	}
}
