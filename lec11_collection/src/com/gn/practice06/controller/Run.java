package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {
	public static void main(String[] args) {
		Set<Food> order = new HashSet<Food>();
		order.add(new Food("샐러드",14000));
		order.add(new Food("치킨",23000));
		order.add(new Food("치킨",50000));
		
		// 치킨 주문을 취소하세요. 
		// 남아있는 주문 목록을 출력하세요. 
		order.remove(new Food("치킨",50000));
		System.out.println("5만원 치킨 취소 : "+order);
		// 모든 주문을 초기화하세요. 
		order.clear();
		// 주문 목록을 출력하세요.
		System.out.println("전체 주문 취소 : "+order);
	}
}
