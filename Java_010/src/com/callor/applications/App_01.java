package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력>> ");
		int dan = scan.nextInt();		
		
		System.out.println("====================");
		System.out.println("구구단" + dan + "단");
		System.out.println("--------------------");
		for(int i = 0 ; i < 8 ; i++) {
			
			int num = i + 2;			
		
			System.out.println(dan + " X " +  num + " = " + (dan *  num));			
		}
		System.out.println("====================");
	}
}
