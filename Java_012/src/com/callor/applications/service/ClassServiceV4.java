package com.callor.applications.service;

public class ClassServiceV4 {
	
	public void print() {
		
		System.out.println("우리나라만세");
	}

	/*
	 *  method 선언문에 변수선언키워드(int, float ...)이 있으면 이 키워드를
	 *  return type이라고 부른다.
	 */
	public int result() {//선언문
		
		//  아래는 매서드 코드
		int num1 = 30;
		int num2 = 40;
		int sum = num1 + num2;
		
		/* return의 기능
		 * 1. 현재 실행되고 있는 method를 무조건 끝내라.(method 중단: 어디에서나 사용가능)
		 */
		return sum;
		
		// sum = 100;
		
		
	}

	/*
	 * method 선언문에 void 이외의 return type이 있을 경우
	 * method에는 반드시 return 명령문이 value와 함께 있어야 한다.
	 */
	public String nation() {
		return "대한민국";
	}
	
	
	// 매개변수로 받은 값을 그냥 return 하라
	// 매개변수 num1을 통해 받은 값을 그냥 return하라
	public int resunt(int num1) {
		
		return num1;
	}
	
	// 매개변수로 받은 2개의 값을 덧셈하여 retun하라
	public int result(int num1, int num2) {
		
		return num1 + num2;
	}
	
	// 매개변수로 받은 2개의 실수 값을 덧셈하여 return하라
	// 이때 return 하는 연산 결과 값이 float 이기 때문에
	// return type도 float이 되어야 한다.
	public float result(float num1, float num2) {
		//return (int)(num1 + num2);
		
		return num1 + num2;
	}
}
