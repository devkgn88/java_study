package com.gn.practice08.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice08.model.vo.Machine;

public class Run {
	public static void main(String[] args) {
		Set<Machine> machines = new HashSet<Machine>();
		machines.add(new Machine("키보드","K123"));
		machines.add(new Machine("마우스","M456"));
		machines.add(new Machine("모니터","Mo101"));
		
		Iterator<Machine> iterator = machines.iterator();

        System.out.println("* 컴퓨터 주변 기기 목록");
        while (iterator.hasNext()) {
            Machine machine = iterator.next();
            System.out.println("- "+machine);
        }
	}
}
