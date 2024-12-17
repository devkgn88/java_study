package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
	public static void main(String[] args) {
//		LocalDate ld = LocalDate.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy\\MM\\dd");
//		String date = dtf.format(ld);
//		
//		String path = "c:\\test\\sub\\";
//		File dir = new File(path+date);
//		if(!dir.exists()) {
//			if(dir.mkdirs()) {
//				System.out.println(dir.getPath()+"에 디렉토리가 생성되었습니다.");
//			}else {
//				System.out.println("디렉토리 생성에 실패하였습니다.");
//			}
//		} else {
//			System.out.println("이미 존재하는 디렉토리입니다.");
//		}
		Practice p = new Practice();
		File dir = new File("C:\\test\\sub");
        p.deleteFile(dir);
	}
}
