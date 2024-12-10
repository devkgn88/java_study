package com.gn.study.controller;

import java.util.ArrayList;
import java.util.List;

public class ToDoListChecker {
	public static void main(String[] args) {
		List<String> toDoList = new ArrayList<>();

        // 1. 리스트가 비어 있는지 확인
        if (toDoList.isEmpty()) {
            System.out.println("할 일이 아직 없습니다.");
        }

        // 2. 할 일 추가
        toDoList.add("운동하기");
        toDoList.add("책 읽기");

        // 3. 특정 작업이 있는지 확인
        if (toDoList.contains("코딩 공부하기")) {
            System.out.println("O");
        } else {
            System.out.println("X");
            toDoList.add("코딩 공부하기");
        }

        // 4. 전체 할 일 출력
        System.out.println("할 일 목록: " + toDoList);
	}
}
