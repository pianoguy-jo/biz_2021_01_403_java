package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	public static void main(String[] args) {
		// Scanner 클래스를 객체로 생성하면서
		// 운영체제의 키보드 시스템과 연결한다
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int intNen = scan.nextInt();
		
		boolean num = intNen % 2 == 0;
		
		if(num) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}

}
