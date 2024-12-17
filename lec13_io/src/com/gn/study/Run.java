package com.gn.study;

import java.io.File;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		// (1) 디렉토리 경로 설정(File 객체 생성)
		//File dir = new File("C:\\exampleDir");
		// (2) 디렉토리 생성
		//dir.mkdir();
		
//		File dir2 = new File("C:\\parentDir\\childDir");
//		dir2.mkdirs();
		
		// 2. 디렉토리 삭제
		//File path = new File("C:\\exampleDir");
		//path.delete();
		//File path2 = new File("C:\\parentDir");
		//path2.delete();
		
//		File dir3 = new File("C:\\testDir");
//		if(dir3.exists() == false) {
//			if(dir3.mkdirs()) {
//				System.out.println("정상 생성");
//			} else {
//				System.out.println("실패");
//			}
//		}
//		
//		if(dir3.exists()) {
//			if(dir3.delete()) {
//				System.out.println("정상 삭제");
//			} else {
//				System.out.println("삭제 실패");
//			}
//		}
		
		// 1. 파일 경로 설정
//		String filePath1 = "C:\\parentDir\\childDir\\exampleFile.txt";
//		File file1 = new File(filePath1);
//		try {
//            // 3. 파일 생성 시도
//            if (file1.createNewFile()) { // 파일이 존재하지 않으면 파일 생성
//                System.out.println("파일이 성공적으로 생성되었습니다: " + filePath1);
//            } else { // 파일이 이미 존재하는 경우
//                System.out.println("파일이 이미 존재합니다: " + filePath1);
//            }
//        } catch (IOException e) {
//            System.out.println("파일 생성 중 오류가 발생했습니다.");
//            e.printStackTrace();
//        }
		
		String filePath2 = "C:\\parentDir\\childDir\\exampleFile.txt";
		File file2 = new File(filePath2);
		if(file2.delete()) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패 또는 존재하지 않음");
		}
	}
}
