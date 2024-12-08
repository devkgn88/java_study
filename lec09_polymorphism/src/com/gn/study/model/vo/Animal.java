package com.gn.study.model.vo;

public abstract class Animal {
	// 추상 메소드 makeSound 선언
    public abstract void makeSound();
    
    public void breath() {
    	System.out.println("동물은 숨을 쉽니다.");
    }
}
