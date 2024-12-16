package com.gn.study.controller;

import java.util.Calendar;

public class CalendarRun {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);

		System.out.println("현재 연도: " + year);
		System.out.println("현재 월: " + month);
		System.out.println("현재 날짜: " + date);
		
		Calendar c1 = Calendar.getInstance();
		int year1 = c1.get(Calendar.YEAR);
		int month1 = c1.get(Calendar.MONTH)+1;
		int day1 = c1.get(Calendar.DATE);
		int date1 = c1.get(Calendar.DAY_OF_WEEK);
		String str1 = "";
		switch(date1) {
			case 1 : str1="월"; break;
			case 2 : str1="화"; break;
			case 3 : str1="수"; break;
			case 4 : str1="목"; break;
			case 5 : str1="금"; break;
			case 6 : str1="토"; break;
			default : str1="일"; break;
		}
		System.out.println(year1+"년 "+month1+"월 "+day1+"일 "+str1+"요일");
		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2024, 12-1, 25);
		System.out.println(christmas.get(Calendar.YEAR)+"년 "
				+(christmas.get(Calendar.MONDAY)+1)+"월 "
				+christmas.get(Calendar.DATE)+"일");
		
	}
}
