package com.gn.study.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.gn.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		HashMap<String, Snack> snackMap = new HashMap<String,Snack>();
		snackMap.put("다이제", new Snack("초코맛", 1144));
		snackMap.put("칸초", new Snack("밀크맛", 270));
		snackMap.put("새우깡", new Snack("매운맛", 500));
		snackMap.put("포테이토칩", new Snack("양파맛", 500));
				
		System.out.println(snackMap);
		
		// 매운맛 새우깡이 트러플맛으로 바뀜
		snackMap.put("새우깡", new Snack("트러플맛", 700));	
		System.out.println(snackMap);
		// 양파맛 포테이토칩을 소금맛으로 변경 
		snackMap.get("포테이토칩").setFlavor("소금맛");
		System.out.println(snackMap);
		
		Map<String,Object> flower2 = new TreeMap<String,Object>(Collections.reverseOrder());
		flower2.put("name","튤립");
		flower2.put("lang","고백");
		flower2.put("price",20000);
		flower2.put("day",10);
		System.out.println(flower2);
	}
}
