package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gn.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();
		
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("저녁");
		meal.add("야식");
		System.out.println(meal);
		meal.add(1, "점심");
		System.out.println(meal);
		
		meal.remove(2);
		System.out.println(meal);
		meal.clear();
		System.out.println(meal);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("김철수",50));
		
		if(studentList.indexOf(new Student("김철수",50)) != -1) {
			System.out.println("indexOf : ==");
		} else {
			System.out.println("indexOf : !=");
		}
		
		if(studentList.contains(new Student("김철수",50))) {
			System.out.println("contains : ==");
		} else {
			System.out.println("contains : !=");
		}
		studentList.add(new Student("이영희",30));
		studentList.add(new Student("홍길동",40));
		
//		Collections.sort(studentList);
		Collections.sort(studentList, new Student());

		System.out.println(studentList);
		
	}
}
