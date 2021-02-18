package com.callor.applications;

import java.util.Scanner;

public class Class_04 {
	/*
	 * 인스턴스(객체)변수 scan1을 생성하고
	 * Scanner(scan1) 클래스 nextInt() method를 호출하여
	 * 키보드입력을 받고 입력받은 정수를 인스턴스 변수 num2에 
	 * 저장하는 코드
	 * 
	 * 오류는 나지 않지만 사용하면 안되는 코드
	 */
	Scanner scan1 = new Scanner(System.in);
	private int num2 = scan1.nextInt();
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * main() method의 지역 변수
		 * 지역변수를 선언할 경우는 초기화 하지 않고 다른
		 * method 
		 */
		int num = scan.nextInt();
		
	}

}
