package com.callor.oop;

import java.util.Scanner;

public class String_01 {
	
	public static void main(String[] args) {
		
		String str1 = "대한민국";
		
		String str2 = ""; // 아직 변수 이름이 안 정해 졌을 때 ""을 사용함
		System.out.println(str2);// ""입력하면 오류가 않생김
		
		int num = 0;
		
     	 // 정수의 값이 아직 정해지지 않았을 경우 Integer를 사용하여 변수의 값을 "null" 입력
		// 값이 저장이 됬는지 않됬는지에도 사용가능
		Integer num2 = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자>>");
		String strNum = scan.nextLine();
		
		/*
		 * null
		 * 0 도 아니고 어떤 값도 아닌 아무것도 없는 상태
		 * 클래스를 개체로 선언할때
		 * 임시로 설정하는 값으로 많이 사용한다.
		 * Random rnd = new Random() 이렇게 사용하는 것이 좋다.
		 * 또는 Random rnd = null 사용하는것이 좋다.
		 * 
		 */
		if(strNum == null) {
			System.out.println("숫자를 입력하시요");
			
		}
		
	}

}
