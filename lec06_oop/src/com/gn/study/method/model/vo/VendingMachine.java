package com.gn.study.method.model.vo;

public class VendingMachine {
	// 1. void 반환형 메소드
	public void sayHi() {
		 System.out.println("안녕하세요~");
	}
	// 2. 기본 자료형
	public int getBalance() {
		return 500;
	}
	// 3. 배열
	public String[] sodaList() {
		String[] arr = new String[] {"콜라","사이다","밀키스"};
		return arr;
	}
	
	//4. 클래스
	public Soda selectedSoda() {
		Soda s = new Soda();
		return s;
	}
}
