package com.gn.homework09.model.vo;

public class Student {
	private static int studentNo = 0;
	private String studentName;
	private String className;
	
	public Student() {
		studentNo ++;
	}
	
	public int getStudentNo() {
		return studentNo;
	} 
	
	public void setStduentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getClassName() {
		return className;
	}
}
