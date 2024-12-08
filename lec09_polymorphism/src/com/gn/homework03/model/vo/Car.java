package com.gn.homework03.model.vo;

public class Car {
	private Engine engine;
	
	public Car() {}
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine() {
		engine.start();
	}
}