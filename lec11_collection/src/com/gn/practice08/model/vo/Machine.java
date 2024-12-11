package com.gn.practice08.model.vo;

import java.util.Objects;

import com.gn.practice07.model.vo.Equipment;

public class Machine {
	private String name;
	private String model;
	
	public Machine() {}
	public Machine(String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,model);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Machine) {
			Machine other = (Machine)obj;
			if(other.name.equals(this.name)
					&&other.model.equals(this.model)) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return name+" : "+model;
	}
}
