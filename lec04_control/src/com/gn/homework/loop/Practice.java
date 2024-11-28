package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	// 1~50까지 짝수 합하기
		public void practice01() {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("정수(1~50) : ");
				int num = sc.nextInt();
				int sum = 0;
				if(1 <= num && num <= 50 ) {
					for(int i = 1 ; i <= num ; i++) {
						if(i % 2 == 0) {
							sum += i;
						}else {
							continue;
						}
					}
					System.out.println("합계 : "+sum);
					break;
				}else {
					System.out.println("1~50 사이의 정수를 입력하세요.");
				}
			}

		}
		
		// 구구단 무한반복
		public void practice02() {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("숫자 : ");
				int num = sc.nextInt();
				if(num < 0 || num > 9) {
					if(num < 0) {
						System.out.println("양수만 입력해주세요.");
					} else if(num > 9) {
						System.out.println("9이하의 숫자를 입력해주세요.");
					}
					
				} else if(num == 0) {
					break;
				} else {
					for(int i = num ; i <= 9 ; i++) {
						System.out.println("=== "+i+"단 ===");
						for(int j = 1 ; j <= 9 ; j++) {
							System.out.println(i+" * "+j+" = "+ i*j);
						}
					}
				}
			}
		}
		
		// 탈출합시다.
		public void practice03(){
			Scanner sc = new Scanner(System.in);

	        // 무한 루프
	        for (;;) {
	            System.out.print("입력: ");
	            String input = sc.nextLine();
	            
	            // "탈출"을 입력하면 루프 탈출
	            if (input.equals("탈출")) {
	                break;
	            }

	            System.out.println(input);
	        }

	        System.out.println("프로그램 종료");
		}
		
		// 게임 재시작
		public void practice04(){
			Scanner sc = new Scanner(System.in);
	        String playAgain = "";

	        do {
	            // 게임 실행 코드
	            System.out.println("게임을 실행합니다!");
	            
	            // 게임 종료 후 다시 플레이할 것인지 묻는 메시지 표시
	            System.out.println("게임을 다시 플레이하시겠습니까? (yes/no)");
	            playAgain = sc.nextLine();
	        } while (playAgain.equalsIgnoreCase("yes"));

	        System.out.println("게임을 종료합니다.");
		}
		
		// 양수만 더하기
		public void practice05() {
			Scanner sc = new Scanner(System.in);
			int sum = 0; 
			while(true) {
				System.out.print("숫자(0을 입력하면 종료) : ");
				int num = sc.nextInt();
				if(num == 0) {
					break;
				} 
				if(num < 0) {
					continue;
				}
				sum += num;
			}
			System.out.println("양수의 합계 : "+sum);
		}
		
		// 트리 만들기
		public void practice06() {
			for(int i = 0 ; i < 5 ; i++){ 
			    for(int j = 0 ; j < 4-i ; j++ ){ 
			        System.out.print(" "); 
			    } 
			    for(int j = 0 ; j < 2*i+1 ; j++){ 
			        System.out.print("*"); 
			    } 
			    System.out.println(""); 
			}
		}
		
		// 박수박수박
		public void practice07() {
			Scanner sc = new Scanner(System.in);
		      int number = 0;
		      while(true){
		        System.out.print("정수 : ");
		        number = sc.nextInt();
		        if(number <= 0){
		          System.out.println("양수가 아닙니다.");
		        } else{
		          for (int i = 1; i <= number; i++) {
		            if (i % 2 == 0) {
		                System.out.print("수");
		            } else {
		                System.out.print("박");
		            }
		          }
		          break;
		        }
		      }
		}
		
		// 문자열의 개수
		public void practice08() {
			Scanner scanner = new Scanner(System.in);
	        char repeat;

	        do {
	            System.out.print("문자열: ");
	            String str = scanner.nextLine();

	            System.out.print("문자: ");
	            char ch = scanner.next().charAt(0);

	            int count = 0;
	            for (int i = 0; i < str.length(); i++) {
	                if (str.charAt(i) == ch) {
	                    count++;
	                }
	            }

	            System.out.println("포함된 개수: " + count);

	            do {
	                System.out.print("다시 입력하시겠습니까? : ");
	                repeat = scanner.next().charAt(0);
	                if (repeat != 'y' && repeat != 'Y' && repeat != 'n' && repeat != 'N') {
	                    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
	                }
	            } while (repeat != 'y' && repeat != 'Y' && repeat != 'n' && repeat != 'N');

	            scanner.nextLine(); // 개행 문자 처리
	        } while (repeat == 'y' || repeat == 'Y');

	        scanner.close();
			
		}	

}
