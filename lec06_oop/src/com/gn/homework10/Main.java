package com.gn.homework10;

public class Main {
	public static void main(String[] args) {
		// 은행 계좌 생성
        Account account1 = new Account("123-456-789", 100000);
        Account account2 = new Account("987-654-321", 50000);
				
				// 123-456-789 계좌에서 30000원 출금
				account1.withdraw(30000);
				// 987-654-321 계좌에 100000원 입금
				account2.deposit(100000);
				
        // 은행 업무 수행
        Bank bank = new Bank();
        bank.transfer(account1, account2, 50000);
        
        // 잔액 출력
        System.out.println("계좌번호 : "+account1.getAccountNumber());
        System.out.println("현재 잔액 : "+account1.getBalance());
        System.out.println("계좌번호 : "+account2.getAccountNumber());
        System.out.println("현재 잔액 : "+account2.getBalance());
	}
}
