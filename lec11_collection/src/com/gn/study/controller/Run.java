package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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
		
		
		// 삭제
		city.remove("서울");
		System.out.println(city);
		
		set1.remove(new Student("김철수",15));
		System.out.println(set1);
		
		// 집합(합집합, 교집합, 차집합)
        Set<Integer> class1 = new HashSet<Integer>();
        class1.add(1);
        class1.add(2);
        class1.add(3);
        Set<Integer> class2 = new HashSet<Integer>();
        class2.add(2);
        class2.add(3);
        class2.add(4);
        
//		class1.addAll(class2);
//		System.out.println("합집합 : "+class1);
		
//		class1.retainAll(class2);
//		System.out.println("교집합 : "+class1);
        
        class1.removeAll(class2);
        System.out.println("차집합 : "+class1);
        
        Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("홍길동",20));
		set2.add(new Student("송강",21));
		set2.add(new Student("차은우",28));
		// 합집합
//		set1.addAll(set2);
//		System.out.println(set1);
		// 새로운 Set에 합하는 법
//		Set<Student> set3 = new HashSet<Student>();
//		set3.addAll(set1);
//		set3.addAll(set2);
//		System.out.println(set3);
		// 교집합 
//		set1.retainAll(set2);
//		System.out.println(set1);
		// 차집합
		set1.removeAll(set2);
		System.out.println(set1);
		
		System.out.println(city);
		city.add("서울");
		city.add("대전");
		city.add("대구");
		for(String str : city) {
			System.out.println(str);
		}
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		
		Iterator<String> iterator = fruits.iterator();
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.print(fruit);
			iterator.remove();
			if(fruits.size() != 0) System.out.print(",");
		}
		
	}
}
