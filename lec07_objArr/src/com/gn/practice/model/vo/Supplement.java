package com.gn.practice.model.vo;

public class Supplement {
	private String name;
	private int dosage;
	private int price;
	
	// 기본 생성자
	public Supplement() {}
	
	// 매개변수 생성자
	public Supplement(String name, int dosage, int price) {
		this.name = name;
		this.dosage = dosage;
		this.price = price;
	}
	
	public void displayInfo() {
        System.out.println("이름: " + name + ", 복용량: " + dosage + "알, 가격: " +price + "원");
    }

}
