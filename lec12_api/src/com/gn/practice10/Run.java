package com.gn.practice10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate releaseDate = LocalDate.of(2024, 12, 25);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		long left = ChronoUnit.DAYS.between(today, releaseDate);
		
		System.out.println("오늘 날짜 : " + today.format(dtf));
        System.out.println("영화 개봉까지 남은 날 : " + left + "일");
        System.out.println("영화 개봉일의 요일 : "+getKoreanDayOfWeek(releaseDate.getDayOfWeek().getValue()));
		System.out.println("개봉일 : "+releaseDate.format(dtf));
	}
	
	public static String getKoreanDayOfWeek(int day) {
        switch (day) {
            case 1: return "월요일";
            case 2: return "화요일";
            case 3: return "수요일";
            case 4: return "목요일";
            case 5: return "금요일";
            case 6: return "토요일";
            case 7: return "일요일";
            default: return "";
        }
    }
}
