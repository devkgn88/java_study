package com.gn.study.method.model.vo;

public class Hospital {

    // 1. public 메소드: 누구나 접근 가능한 응급전화
    public void emergencyCall() {
        System.out.println("응급 전화를 받습니다!");
    }

    // 2. protected 메소드: 전문의(특별한 권한이 있는 사람) 상담 기록
    protected void specialistConsultation() {
        System.out.println("전문의 상담 기록을 열람합니다.");
    }

    // 3. default 메소드: 병원 "내부" 스태프 공지
    void staffAnnouncement() {
        System.out.println("스태프 공지를 확인합니다.");
    }

    // 4. private 메소드: 개인(나) 의료 기록
    private void personalMedicalRecord() {
        System.out.println("개인 의료 기록을 열람합니다.");
    }

    // static 메소드: 모든 병원에서 공통으로 사용하는 응급 전화 번호
    public static void hospitalInfo() {
        System.out.println("병원 응급 전화번호: 119");
    }
}
