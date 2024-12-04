package com.gn.homework05.controller;

import com.gn.homework05.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.changeName("김철수");
		m1.printName();
	}
}
