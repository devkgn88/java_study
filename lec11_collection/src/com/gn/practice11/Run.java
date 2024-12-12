package com.gn.practice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		Map<Integer,Fruit> fruits=new HashMap<Integer,Fruit>();
		fruits.put(3,new Fruit("포도","강화도",5,35000));
		fruits.put(1,new Fruit("귤","제주",10,15000));
		fruits.put(2,new Fruit("사과","예산",5,25000));
		fruits.put(4,new Fruit("배","나주",10,50000));
		
		// 1. 전체 데이터 조회
		System.out.println("=== 전체 데이터 조회 ===");
		fruits = new TreeMap<Integer,Fruit>(fruits);
		Set<Integer> fruitKey = fruits.keySet();
		Iterator<Integer> itr1 = fruitKey.iterator();
		while(itr1.hasNext()) {
			int key = itr1.next();
			Fruit f = fruits.get(key);
			System.out.println(key + ":" +f);
		}
		
		// 2. 가격이 20000원 이상인 과일만 key,value 출력 
		System.out.println("=== 가격 20000원 이상 ===");
		Set<Entry<Integer,Fruit>> entrySet = fruits.entrySet();
		Iterator<Entry<Integer,Fruit>> itr2 = entrySet.iterator();
		while(itr2.hasNext()) {
			Entry<Integer,Fruit> entry = itr2.next();
			Fruit f = entry.getValue();
			if(f.getPrice() < 20000) {
				System.out.println(entry.getKey()+" : "+f);
			}
		}
		
		// 3. 이름이 한글자인 과일의 key,value
		System.out.println("=== 이름이 한글자인 과일 === ");
		itr1 = fruitKey.iterator();
		while(itr1.hasNext()) {
			int key = itr1.next();
			Fruit f = fruits.get(key);
			if(f.getName().length() == 1) {
				System.out.println(key + ":" +f);
			}
		}
		
		// 4. 포도의 가격을 28000원으로 수정
		itr2 = entrySet.iterator();
		while(itr2.hasNext()) {
			Entry<Integer,Fruit> entry = itr2.next();
			Fruit f = entry.getValue();
			if("포도".equals(f.getName())) {
				f.setPrice(28000);
			}
		}
		System.out.println("=== 포도 가격 인상 ===");
		System.out.println(fruits.get(3));
		
		long after = System.currentTimeMillis();
		System.out.println((after-before)+"밀리초 걸림");
	}
}
