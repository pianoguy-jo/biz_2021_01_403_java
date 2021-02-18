package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);		
		ClassServiceV7 ClassServiceV7 = new ClassServiceV7();
		
		System.out.print("구구단을 입력하시요(2~9단 까지만 가능) :");
		int csV7 = scan.nextInt();
		
		ClassServiceV7.gugudan(csV7);		
	}

}
