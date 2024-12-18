package com.gn.practice06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\practice");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"output.txt");
		String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."}; // 쓸 내용
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
		    // FileWriter를 사용하여 파일에 쓰기
		    fw = new FileWriter(file);
		    bw = new BufferedWriter(fw);

		    for (String line : lines) {
		        bw.write(line); // 한 줄씩 파일에 쓰기
		        bw.newLine();   // 줄 바꿈
		    }

		    bw.close(); // BufferedWriter 닫기
		    fw.close(); // FileWriter 닫기

		    System.out.println("파일에 내용을 성공적으로 썼습니다.");
		} catch (IOException e) {
		    System.err.println("파일에 쓰기 중 오류가 발생했습니다: " + e.getMessage());
		}
	}
}
