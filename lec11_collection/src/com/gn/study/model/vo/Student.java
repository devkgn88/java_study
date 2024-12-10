package com.gn.study.model.vo;

public class Student {
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(s.name.equals(name) && s.age==age) {
				result = true;
			}
		}
		return result;
	}
}
