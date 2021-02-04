package com.callor.varriable;

public class Varriable {

	// project : Java_006
	// base-package : com.callor.varriable
	// class : Varriable
	// 정수형 변수 num1, num2를 선언
	// 두 변수에 30과 40을 각각 저장
	// 두 변수에 저장된 값을 4칙 연산과 MOD(나머지) 연산을 수행한 후 결과를
	// 정수형 변수 result1, resylt2, result3, result4, result5에 각각 저장
	// result* 변수에 저장된 값을 Console에 출력	
	
	public static void main(String args[]) {
				
		int num1 = 30;
		int num2 = 40;
		
		int result1;
		int result2;
		int result3;
		int result4;
		int result5;
		
		result1 = 0;
		result2 = 0;
		result3 = 0;
		result4 = 0;
		result5 = 0;
		
		result1 = num1 + num2;
		result2 = num1 - num2;
		result3 = num1 * num2;
		result4 = num1 / num2;
		result5 = num1 % num2;
						
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);		
				
	}
}
