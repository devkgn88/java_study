package com.gn.study.practice03.controller;

import com.gn.study.practice03.model.vo.Bicycle;
import com.gn.study.practice03.model.vo.Car;
import com.gn.study.practice03.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.go();
		System.out.println(
				);
		Vehicle v2 = new Bicycle();
		v2.go();
	}
}
