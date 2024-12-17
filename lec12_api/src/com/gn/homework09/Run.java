package com.gn.homework09;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Date currentDate = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + sdf.format(currentDate));
		
		Calendar openDay = Calendar.getInstance();
		openDay.set(2025, 1-1, 24);
		long left = openDay.getTimeInMillis()-today.getTimeInMillis();
		left = left/(1000*24*60*60);
		System.out.println("카페 오픈일까지 남은 날 : " + left + "일");
		
		int lastDayOfMonth = openDay.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("오픈달의 마지막 날 : " + lastDayOfMonth + "일");
        
        Date openDate = openDay.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("E요일");
        System.out.println("카페 오픈일의 요일 : "+sdf2.format(openDate));
		
		
	}
}
