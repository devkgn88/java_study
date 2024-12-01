package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	//키순서대로 앉으세요. 
		public void practice01() {
	        // 학생들의 키 배열
	        int[] heights = {152, 180, 165, 158, 171};

	        // 배열을 오름차순으로 정렬
	        for (int i = 0; i < heights.length - 1; i++) {
	            for (int j = 0; j < heights.length - i - 1; j++) {
	                // 현재 요소가 다음 요소보다 크면 위치를 교환
	                if (heights[j] > heights[j + 1]) {
	                    int temp = heights[j];
	                    heights[j] = heights[j + 1];
	                    heights[j + 1] = temp;
	                }
	            }
	        }

	        // 정렬된 배열을 출력
	        for (int i = 0; i < heights.length; i++) {
	            System.out.print(heights[i]);
	            // 마지막 요소가 아닌 경우에는 쉼표와 공백을 출력
	            if (i < heights.length - 1) {
	                System.out.print(", ");
	            }
	        }
		}
		// 값 입력받아 배열 만들기
		public void practice02() {
			Scanner sc = new Scanner(System.in);

	        // 배열의 길이 입력 받기
	        System.out.print("정수 : ");
	        int length = sc.nextInt();

	        // 정수형 배열 선언 및 생성
	        int[] numbers = new int[length];

	        // 배열 초기화
	        for (int i = 0; i < length; i++) {
	            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
	            numbers[i] = sc.nextInt();
	        }

	        // 배열 출력
	        System.out.print("배열 값 : ");
	        for (int i = 0; i < length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println();

	        // 배열의 총 합 계산 및 출력
	        int sum = 0;
	        for (int i = 0; i < length; i++) {
	            sum += numbers[i];
	        }
	        System.out.println("총 합 : " + sum);

	        sc.close();
		}
		
		// 올라갔다 내려갔다
		public void practice03() {
			Scanner sc = new Scanner(System.in);
	        int length;
	        
	        while (true) {
	            System.out.print("정수 : ");
	            length = sc.nextInt();
	            if (length >= 3 && length % 2 != 0) {
	                break;
	            } else {
	                System.out.println("다시 입력하세요.");
	            }
	        }
	        
	        int[] arr = new int[length];
	        int middle = length / 2;
	        
	        for (int i = 0; i <= middle; i++) {
	            arr[i] = i + 1;
	        }
	        
	        for (int i = middle + 1, j = middle - 1; i < length; i++, j--) {
	            arr[i] = j + 1;
	        }
	        
	        // 배열 출력
	        for (int i = 0; i < length; i++) {
	            System.out.print(arr[i]);
	            if (i != length - 1) {
	                System.out.print(", ");
	            }
	        }
	        sc.close();
		}
		
		// 로또 번호 자동 생성기
		public void practice04() {
			int[] ranArr = new int[6];
			for(int i = 0 ; i < ranArr.length ; i++) {
				ranArr[i] = (int)(Math.random()*45) + 1;
				for(int j = 0 ; j < i ; j++) {
					if(ranArr[i]== ranArr[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < ranArr.length - 1; i++) {
			    for (int j = i + 1; j < ranArr.length; j++) { // j를 i+1부터 시작하도록 수정
			        if (ranArr[i] > ranArr[j]) {
			            // 인접한 두 요소를 비교하여 필요에 따라 위치를 교환
			            int temp = ranArr[i];
			            ranArr[i] = ranArr[j];
			            ranArr[j] = temp;
			        }
			    }
			}
			for(int i = 0 ; i< ranArr.length ; i++){
				System.out.print(ranArr[i]+" ");
			}
		}
		// 컴퓨터와 가위바위보
		public void practice05() {
			Scanner scanner = new Scanner(System.in);
	        int games = 0;
	        int wins = 0;
	        int draws = 0;
	        int losses = 0;

	        while (true) {
	            System.out.print("가위바위보 : ");
	            String userChoice = scanner.nextLine();

	            if (userChoice.equals("stop")) {
	                break;
	            }

	            if (!userChoice.equals("가위") && !userChoice.equals("바위") && !userChoice.equals("보")) {
	                System.out.println("잘못 입력하셨습니다.");
	                continue;
	            }

	            // 컴퓨터의 선택을 랜덤으로 결정
	            String[] choices = {"가위", "바위", "보"};
	            int randomIndex = (int) (Math.random() * choices.length);
	            String computerChoice = choices[randomIndex];

	            System.out.println("컴퓨터 : " + computerChoice);
	            System.out.println("김철수 : " + userChoice);

	            // 가위바위보 게임 결과 출력
	            if (userChoice.equals(computerChoice)) {
	                System.out.println("비겼습니다.");
	                draws++;
	            } else if ((userChoice.equals("가위") && computerChoice.equals("보"))
	                    || (userChoice.equals("바위") && computerChoice.equals("가위"))
	                    || (userChoice.equals("보") && computerChoice.equals("바위"))) {
	                System.out.println("이겼습니다 !");
	                wins++;
	            } else {
	                System.out.println("졌습니다 ㅠㅠ");
	                losses++;
	            }

	            games++;
	        }

	        System.out.println(games + "전 " + wins + "승 " + draws + "무 " + losses + "패");
	        scanner.close();
		}
		
		// 배열 늘리기
		public void practice06() {
			// 배열의 크기와 엔터를 입력하면
			// 메모리에 크기값은 nextInt로 사용되지만 
			// 엔터는 계속해서 남아있게 됩니다. 
			// nextLine()은 엔터값 또한 인식하므로
			// 만일 중간에 sc.nextLine()을 사용해서
			// 엔터를 소진해주지 않으면 
			// 첫번째 문자열은 항상 엔터(\n)이 돼요.
			
			Scanner sc = new Scanner(System.in);
			System.out.print("배열의 크기를 입력하세요 : ");
			int leng = sc.nextInt();
			sc.nextLine();
			String[] arr = new String[leng];
			for(int i = 0 ; i < leng ; i++) {
				System.out.print((i+1)+"번째 문자열 : ");
				String book = sc.nextLine();
				arr[i] = book;
			}
			boolean check = true;
			
			while(check){
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				String answer = sc.next();
				if(answer.equals("y")||answer.equals("Y")) {
					System.out.print("더 입력하고 싶은 개수 : ");
					int more = sc.nextInt();
					sc.nextLine();
					String[] copy = new String[leng+more];
					for(int i = 0 ; i < leng ; i++) {
						copy[i] = arr[i];
					}
					for(int i = 0 ; i < more ; i++) {
						System.out.print((leng+i+1)+"번째 문자열 : ");
						copy[leng+i]=sc.nextLine();
					}
					
					leng = leng+more;
					arr = copy;
					
				} else if(answer.equals("n") || answer.equals("N")) {
					check = false; 
				} else {
					System.out.println("입력할 수 없는 값입니다.");
				}

			}
			for(int i = 0 ; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			sc.close();
		}
}
