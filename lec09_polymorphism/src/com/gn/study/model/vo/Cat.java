package com.gn.study.model.vo;

public class Cat extends Animal{
	// 추상 메소드 makeSound의 구현
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
    
    @Override
    public void breath() {
    	System.out.println("test");
    }
}
