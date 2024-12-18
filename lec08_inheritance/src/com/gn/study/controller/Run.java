package com.gn.study.controller;

import com.gn.study.model.vo.Cat;
import com.gn.study.model.vo.Child;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Parent;

public class Run {
	public static void main(String[] args) {
		// Dog 클래스의 객체 생성
		Dog dog = new Dog();
		// Dog 클래스의 메소드 호출
		dog.bark();
		// Animal 클래스의 메소드 호출
		dog.eat();
		
		// Cat 클래스의 객체 생성
		Cat cat = new Cat();
		// Cat 클래스의 메소드 호출
		cat.meow();
		// Animal 클래스의 메소드 호출
		cat.walk();
		
		Parent p1 = new Parent();
		Parent p2 = new Parent(23);
		
		Child c1 = new Child();
		Child c2 = new Child(48);
		
		System.out.println("=================");
		
		Flower f1 = new Flower("장미","빨간색");
		Flower f2 = new Flower("장미","빨간색");
		// equals
		System.out.println(f1.equals(f2));
		// toString
		System.out.println(f1);
		// hashCode
		System.out.println(f1.hashCode());
	}
}
