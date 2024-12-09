package com.gn.study.model.vo;

public class Calculator {
	public int divide(int a, int b) {
		int result = -1; 
		try {
			result = a/b;
		}catch(Exception e) {
			// e.printStackTrace();
			// System.out.println(e.getMessage());
			System.out.println(e);
		}
		return result;
	}
	
	public double convertUnit(double celsius) throws IllegalArgumentException{
		return celsius * 9 / 5 + 32;
	}
}
