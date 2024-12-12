package com.gn.study.controller;

public class Run {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		int[] src = {10,15,20,25,30};
		int[] dst = new int[src.length];
		// 기본 깊은 복사 방법
//		for(int i = 0 ; i < src.length-1 ; i++) {
//			dst[i] = src[i];
//		}
		// System클래스 활용하기
		// src[1]부터 4개의 요소를 dst[0]으로 복사
		System.arraycopy(src, 0, dst, 0, src.length);
		for(int d : dst) {
			System.out.println(d);
		}
		
		long after = System.currentTimeMillis();
		System.out.println(after);
		
		System.out.println(after-before);
	}
}
