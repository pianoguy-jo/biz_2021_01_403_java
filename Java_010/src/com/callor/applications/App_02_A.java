package com.callor.applications;

import java.util.Scanner;

public class App_02_A {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력( 2 ~ 9 ) >> ");
		int num1 = scan.nextInt();
		
		boolean bYes2 = num1 >=2;
		boolean bYes9 = num1 >=9;
		
		if(bYes2 && bYes9) {
			// 구구단 출력
			
		}
		
		
	}

}
