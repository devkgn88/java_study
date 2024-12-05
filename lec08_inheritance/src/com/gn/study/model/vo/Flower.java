package com.gn.study.model.vo;

public class Flower {
	private String name;
	private String color;
	
	public Flower(String name, String color){
		this.name = name;
		this.color = color;
	} 
	@Override
	public boolean equals(Object obj){
		Flower f = (Flower)obj;
		if(f.color.equals(this.color) && 
				f.name.equals(this.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
	    return "이름 : " + name + ", 색상 : " + color;
	}
}
