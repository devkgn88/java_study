package com.gn.homework06.controller;

import com.gn.homework06.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.printInfo();
		
		Rectangle r2 = new Rectangle(5,3);
		r2.printInfo();
	}
}
