package com.callor.applications.service;

public class ScoreServiceV3 {

	// 정수형 매개변수 2개를 전달 받고 호출할 수 있는 method	
	public void sum(int num1, int num2) {
		System.out.println("정수 숫자 2개");
		System.out.println(num1 + num2);

	}

	// 매개변수가 하나도 없이 호출 할 수 있는 method
	public void sum() {
		System.out.println("매게변수 없음");
	}

	
	// float형 매개변수 2개를 전달하면서 호출할 수 있는 method
	public void sum(float f1, float f2) {
		System.out.println("실수 숫자 2개");
		System.out.println(f1 + f2);
	}

	// 매개변수 2개를 전달하면서 전달할 수 있는 method
	// 단, 2개의 매개변수는 double, float형 순서대로 전달되어야 한다.
	// 만약 sum(100F, 100D)로 바꾸면 오류가 난다.(호출 불가능)
	public void sum(double d, float fnum1) {
		// TODO Auto-generated method stub
		
	}

}
