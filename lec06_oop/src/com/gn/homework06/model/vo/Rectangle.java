package com.gn.homework06.model.vo;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		int result = 0; 
		result = (width*2)+(height*2);
		return result;
	}
	
	public int calculateArea() {
		int result = 0;
		result = width * height;
		return result;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사격형의 둘레");
		System.out.println(calculateRound()+"cm");
		System.out.println("2. 사격형의 넓이");
		System.out.println(calculateArea()+"cm");
	}	
}
