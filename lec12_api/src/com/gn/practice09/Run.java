package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2024, 2-1 , 1);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis()-c.getTimeInMillis();
		diff = diff/1000;
		diff = diff/(24*60*60);
		System.out.println(diff);
	}
}
