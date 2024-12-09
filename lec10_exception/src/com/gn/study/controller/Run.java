package com.gn.study.controller;

import com.gn.study.model.vo.Account;
import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.InsufficientBalanceException;
import com.gn.study.model.vo.User;

public class Run {
	public static void main(String[] args) {
		String[] arr = new String[3];
		try {
			System.out.println(arr[0].length());
		}catch(NullPointerException e) {
			System.out.println("null의 길이는 도출할 수 없어요");
		}
		
		int[] numbers = {1,2,3};
		try {
			System.out.println(numbers[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스는 조회할 수 없어요.");
		}
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		System.out.println("계산 끝!!");
		
		System.out.println("===== 다중 catch =====");
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("Null 값을 참조하려고 했습니다: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("런타임 예외 발생: " + e.getMessage());
        } catch (Exception e) { // 상위 클래스
            System.out.println("기타 예외 발생: " + e.getMessage());
        }
        
        User u1 = new User();
        u1.checkAge(18);
        
        try {
        	u1.nameLength(null);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        System.out.println("이름 확인 가능?");
//        try {
//            double fahrenheit = c.convertUnit(-300); // 잘못된 입력
//            System.out.println("화씨 온도: " + fahrenheit);
//        } catch (IllegalArgumentException e) {
//            System.out.println("예외 발생: " + e.getMessage());
//        }

        Account account = new Account("김철수",10000);
        try {
        	account.withdraw(15000);
        }catch(InsufficientBalanceException e) {
        	e.printStackTrace();
        }
	}
}
