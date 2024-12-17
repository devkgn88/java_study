package com.gn.study.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateRun {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf1 
			= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		// 형식화된 문자열로 변환
		String result1 = now.format(dtf1);
		System.out.println("형식화된 날짜와 시간: " + result1);
		
		
        String str2 = "2024-12-25 13:50:26";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date2 = LocalDateTime.parse(str2, dtf2);
        System.out.println("파싱된 날짜: " + date2.format(dtf1));
	}
}
