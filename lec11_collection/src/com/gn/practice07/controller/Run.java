package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓",15000));
		storage1.add(new Equipment("배트",6000));
		storage1.add(new Equipment("축구공",3000));
		
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트",6000));
		storage2.add(new Equipment("야구공",5000));
		storage2.add(new Equipment("글로브",9000));
		
        Set<Equipment> union = new HashSet<Equipment>();
        union.addAll(storage1);
        union.addAll(storage2);
        System.out.println("합집합:" + union);
        
        Set<Equipment> inter = new HashSet<Equipment>();
        inter.addAll(storage1);
        inter.retainAll(storage2);
        System.out.println("교집합:" + inter);
        
        Set<Equipment> diff = new HashSet<Equipment>();
        diff.addAll(storage1);
        diff.removeAll(storage2);
        System.out.println("차집합:" + diff);
	}
}
