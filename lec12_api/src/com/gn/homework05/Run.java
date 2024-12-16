package com.gn.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("생년월일 : ");
        String birth = sc.nextLine();
        
        String firstName = name.substring(0, 1);
        String yearLastTwo = birth.substring(2, 4);
        String day = birth.substring(6, 8);
        String lastName = name.substring(1);
        
        String pwd = firstName + yearLastTwo + day + lastName;
        System.out.println("암호 : " + pwd);
        sc.close();
	}
}	
