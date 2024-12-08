package com.gn.study.practice03.model.vo;

public class Vehicle {
	private int wheel;
	
	public Vehicle() {}
	
	public Vehicle(int wheel) {
		this.wheel = wheel;
	}
	
	public int getWheel() {
		return wheel;
	}	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public void go() {
		System.out.print("지나가요~");
	}
}
