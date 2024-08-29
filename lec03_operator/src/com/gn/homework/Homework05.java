package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 주민번호 입력 받기
        System.out.print("주민번호(-) : ");
        String idNumber = sc.nextLine();

        // 7번째 숫자를 추출하여 성별 판별
        char code = idNumber.charAt(7);

        // 7번째 숫자가 1 또는 3이면 남성, 2 또는 4이면 여성
        // String gender = (code == '1' || code == '3') ? "남성" : "여성";
        
        String gender = (code == '1' || code == '2' || code =='3' || code == '4') ?
        		((code == '1' || code == '3') ? "남성" : "여성"):"잘못된 값";
        

        // 결과 출력
        System.out.println("입력하신 주민번호는 " + gender + "입니다.");
	}
}
