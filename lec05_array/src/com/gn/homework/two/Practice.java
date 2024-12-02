package com.gn.homework.two;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[][] arr = new int[4][4];
		int count = 1; 
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		for(int i = arr.length -1 ; i >= 0 ; i--) {
			for(int j = arr[i].length-1 ; j >= 0 ; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public void practice02() {
		int[][] arr = new int[4][4];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				int num = (int)(Math.random()*10)+1;
				arr[i][j] = num;
			}
		}
		for(int i = arr.length -1 ; i >= 0 ; i--) {
			for(int j = arr[i].length-1 ; j >= 0 ; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0; 
		while(true) {
			System.out.print("행 : ");
			row = sc.nextInt();
			if(1 <= row && row <= 10) {
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		while(true) {
			System.out.print("열 : ");
			col = sc.nextInt();
			if(1 <= col && col <= 10) {
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		char[][] arr = new char[row][col];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				int num = (int)(Math.random()*26)+65;
				arr[i][j] = (char)num;
			}
		}
		for(int i = arr.length -1 ; i >= 0 ; i--) {
			for(int j = arr[i].length-1 ; j >= 0 ; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}
	
	public void practice04() {
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"}, 
			{"열", "히", "! ", "더", "!! "}};
		
		for(int i = 0 ; i < strArr.length ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(strArr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice05() {
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2]; // 1분단
		String[][] seat2 = new String[3][2]; // 2분단
		
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < seat2.length; i++){
			for(int j = 0; j <seat2[i].length; j++){
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public void practice06() {
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int count = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j <seat1[i].length; j++){
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < seat2.length; i++){
			for(int j = 0; j <seat2[i].length; j++){
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		String partName = ""; 
		String rowName = ""; 
		String colName = ""; 
		
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				if(seat1[i][j].equals(name)) {
					partName = "1분단";
					if(i == 0){
						rowName = "첫 번째 줄";
					}else if(i == 1){
						rowName = "두 번째 줄";
					}else{
						rowName = "세 번째 줄";
					}
					if(j == 0){
						colName = "왼쪽";
					}else{
						colName = "오른쪽";
					}
					
					break;
				}
			}
		}
		
		for(int i = 0; i < seat2.length; i++){
			for (int j = 0; j < seat2[i].length; j++){
				if(seat2[i][j].equals(name)){
					partName = "2분단";
					if(i == 0){
						rowName = "첫 번째 줄";
					}else if(i == 1){
						rowName = "두 번째 줄";
					}else{
						rowName = "세 번째 줄";
					}
					if(j == 0){
						colName = "왼쪽";
					}else{
						colName = "오른쪽";
					}
					
					break;
				}
			}
		}
		
		System.out.println("검색하신 " + name + " 학생은 " + partName + " " + rowName + " " + colName + "에 있습니다.");
		sc.close();
	}

}
