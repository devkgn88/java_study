package com.gn.study.model.vo;

//Dog 클래스는 Animal 클래스를 상속받음
public class Dog extends Animal {
	 // 추상 메소드 makeSound의 구현
	 @Override
	 public void makeSound() {
	     System.out.println("멍멍!");
	 }
}
