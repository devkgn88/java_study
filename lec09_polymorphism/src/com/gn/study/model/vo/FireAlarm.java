package com.gn.study.model.vo;

public class FireAlarm implements Alarm {
	@Override
	public void soundAlarm() {
		System.out.println("화재 경보가 울립니다! 대피하세요!");
	}
}
