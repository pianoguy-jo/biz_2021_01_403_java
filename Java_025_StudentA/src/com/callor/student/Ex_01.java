package com.callor.student;

public class Ex_01 {
	
	public static void main (String args[]) {
		
		// 두개의 정수를 변수에 담고 덧셈하여 출력하고 싶다
		
		int num1 = 0;
		int num2 = 0;
		
		num1 = 50;
		num2 = 100;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		int num3; // 변수가 초기화 되지 않았기 때문에 오류 발생
		num3 = 100; // 생량하면
		System.out.println(num3);// 오류발생
		
		
		int num4 = 0;// 변수에 0을 대입하는 것을 초기화, clear한다.
		
	}

}
