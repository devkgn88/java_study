package com.gn.study.model.vo;

public class Child extends Parent{
	private int b;
	public Child() {
		System.out.println("자식 기본 생성자 : "+b);
	}
	public Child(int b) {
		System.out.println("자식 매개변수 생성자 : "+b);
	}
}
