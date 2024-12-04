package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run{  
	public static void main(String[] args) {  
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 생성
		Student[] arr = new Student[10];
		
		// 학생수를 나타내는 변수
		// 한명 추가시 1씩 증가
		int count = 0;
		
		// 'n'또는 'N'을 입력할때까지 계속 학생 정보 입력받기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			arr[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.print("계속 추가하시겠습니까?");
			String str = sc.nextLine();
			
			if("n".equals(str)||"N".equals(str)) {
				break;
			}
		}
		sc.close();
		
		// 현재 배열에 담겨있는  
		// 학생들의 정보를 모두 출력 
		for(int i = 0 ; i < count; i++) {
			int sum = arr[i].getKor() + arr[i].getMath() + arr[i].getEng();
			
			System.out.println(arr[i].information() + "평균 : " + sum / 3);
		}
	} 
}  
