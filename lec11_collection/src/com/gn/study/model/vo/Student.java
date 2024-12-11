package com.gn.study.model.vo;

import java.util.Objects;

//public class Student implements Comparator<Student>{
//	private String name;
//	private int age;
//	
//	public Student() {}
//	
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "[이름:"+name+",나이:"+ age+"]";
//	}
//	
//	
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		if(obj instanceof Student) {
//			Student s = (Student)obj;
//			if(s.name.equals(name) && s.age==age) {
//				result = true;
//			}
//		}
//		return result;
//	}
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.age > o2.age) return 1;
//		else if(o1.age < o2.age) return -1;
//		else return 0;
//	}
//}

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[이름:"+name+",나이:"+ age+"]";
	}
	
	
	@Override
	public int compareTo(Student other) {
		// 자기자신의 age가 other의 age보다 크면 양수
		if(this.age > other.age) return 1;
		// 자기자신의 age가 other의 age보다 작으면 음수
		else if(this.age < other.age) return -1;
		// 두 값이 같으면 0
		else return 0;
//		return this.age-other.age;		
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		if(obj instanceof Student) {
//			Student s = (Student)obj;
//			if(s.name.equals(name) && s.age==age) {
//				result = true;
//			}
//		}
//		return result;
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		if(obj instanceof Student) {
//			Student other = (Student)obj;
//			if(other.name.equals(this.name) 
//				&& other.age == this.age) {
//				result = true;
//			}
//		}
//		return result;
//	}
}
