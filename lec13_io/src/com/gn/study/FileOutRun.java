package com.gn.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun {
	public static void main(String[] args) {
		// 무조건 생성 모드
		// 기존 파일이 있으면 지우고 다시 만듦
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdirs();
		}

		// 파일 생성
		File file = new File(dir,"sample1.dat");

		FileOutputStream out = null;

		// 파일 출력 스트림 선언
		try {
			// FileOutputStream out = new FileOutputStream(file);
			out = new FileOutputStream(file);
			
			// 출력할 데이터 구성
			String str = "hello";
			byte[] b = str.getBytes();
			
			// 출력
			out.write(b);
			
			// 플러싱(선택)
			out.flush();
			
			// 확인
			System.out.println(file.length() + "크기의 " + file.getPath() + " 파일이 생성되었습니다.");

		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 파일 출력 스트림 닫기
			try {
				if(out != null) {
					out.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
