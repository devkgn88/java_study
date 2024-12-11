package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
		Collections.sort(studentList);
//		Collections.sort(studentList, new Student());

		System.out.println(studentList);
		
		System.out.println("=============================");
		// HashSet요소 추가
		Set<String> city = new HashSet<String>();
		city.add("서울");
		city.add("부산");
		System.out.println(city);
		// 중복된 정보 추가 시도 후 출력
		city.add("서울");
		System.out.println(city);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수",15));
		set1.add(new Student("홍길동",21));
		set1.add(new Student("김철수",15));

		System.out.println(set1);
		for(Student s : set1) {
			System.out.println(s.hashCode());
		}
		
	}
}
