package com.gn.study.controller;

import java.util.ArrayList;
import java.util.List;

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
		
		
	}
}
