package com.gn.practice.controller;

import com.gn.practice.model.vo.Supplement;

public class Run {
	public static void main(String[] args) {
		// 객체 배열 선언 및 생성
		Supplement[] supplements = new Supplement[4];
		
		// 배열 초기화
		supplements[0] = new Supplement("유산균", 1, 18000);
		supplements[1] = new Supplement("비타민B", 1, 15000);
		supplements[2] = new Supplement("루테인", 2, 20000);
        supplements[3] = new Supplement("비타민D", 1, 12000);

		System.out.println("========== 영양제 목록 ==========");
        for (Supplement supplement : supplements) {
            supplement.displayInfo();
        }

	}
}
