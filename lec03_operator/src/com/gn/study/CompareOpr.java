package com.gn.study;

public class CompareOpr {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		// 등호
		boolean same = num1 == num2;
		
		// 부등호
		boolean diff = num1 != num2;
		
		// 크다, 작다
		boolean big = num1 > num2;
		boolean small = num1 < num2;
		
		// 크거나 같다, 작거나 같다
		boolean bigSame = num1 >= num2;
		boolean smallSame = num1 <= num2;
		
		// char 비교
		char c1 = 'a';
		char c2 = 'd';
		boolean compareChar = c1 < c2;
		System.out.println(compareChar);
		
		System.out.println((int)'a');
		System.out.println((int)'A');
		
		System.out.println((double)3);
		
		System.out.println("===== 기본형 비교 =====");
		int num = 2;
		boolean num_bool = num == 7;
		System.out.println(num_bool);
		
		// 문자열 비교
		System.out.println("===== 문자열 비교 =====");
		String str1 = "apple";
		String str2 = "apple";
		String str3 = new String("apple");
		String str4 = new String("apple");
		// 같은 방식으로 초기화
		boolean test1 = str1 == str2; //true
		boolean test2 = str3 == str4; //false
		System.out.println(test1);
		System.out.println(test2);
		// 다른 방식으로 초기화
		boolean test3 = str1 == str3; //false
		System.out.println(test3);
		
		int a = 6;
		int b = 5;
		int c = 7;

		// AND 연산자 사용 예제
		boolean andResult = (a > b) && (a > c);
		System.out.println("AND 연산 결과: " + andResult);

		// OR 연산자 사용 예제
		boolean orResult = (a > b) || (a > c);
		System.out.println("OR 연산 결과: " + orResult);
	
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println("isFalse : "+isFalse);
		// true && false -> false -> true
		System.out.println(!(test1 && test3));
		// true && !false -> true && true -> true
		System.out.println(test1 && !test3);
		
		// 삼항 연산자
		int x = 5;
		int y = 10;
		int max = (x > y) ? x : y;
		
		int z = 3;
		int large = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(large);
				
		
		
	}
}
