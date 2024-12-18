package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutAddRun {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		// 2. 파일 선언
		File file = new File(dir,"sample2.dat");	
		// 3. FileOutputStream 선언 
		FileOutputStream fos = null;
		try {
			// 4. FileOutputStream 생성
			// - 추가 모드로 생성
			// - FileOutputStream 매개변수로 true 추가
			fos = new FileOutputStream(file,true);
			
			// 5. 출력할 데이터 구성
			String str = "안녕하세요 반갑습니다\n";
			byte[] b = str.getBytes();
			
			// 6. 출력
			fos.write(b);
			
			// 7. 플러싱
			fos.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 8. 스트림 닫기
				if(fos!= null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
