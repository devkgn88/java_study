package com.gn.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputRun1 {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"sample1.dat");

		// 1. 파일 입력 스트림 선언
		FileInputStream in = null;
		try {
			// 2. 파일 입력 스트림 생성
			in = new FileInputStream(file);
			
			// 3. 읽은 데이터를 보관할 배열
			byte[] b = new byte[(int)file.length()];
			int idx = 0 ;
			
			// 4. 읽어오기
			// 읽을 단위
			// int 변수로 1바이트씩 읽음
			int c;
			while(true) {
				// read 할때 IOException 필요
				c = in.read();
				if(c == -1) {
					break;
				}
				b[idx++] = (byte)c;
			}
			String str = new String(b);
			System.out.println(str);
			// 파일 입력 스트림 닫기
			in.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
