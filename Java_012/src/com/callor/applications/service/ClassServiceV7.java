package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV7 {

	public void gugudan(int dan) {

		
		System.out.println("========================================");
		System.out.println("구구단" + dan + "단");
		System.out.println("----------------------------------------");

		for (int i = 1; i < 9; i++) {
			
			int num = i + 1;

			if (dan < 1) {
				System.out.println("0보다 큰 값을 입력하시요");

			} else if (dan > 9) {
				System.out.println("9보다 큰 값을 입력하시요");

			} else if (dan > 1 | dan >= 9) {
				System.out.println(dan + " + " + num + " = " + dan*num
						);
				
			}

		}
		System.out.println("========================================");

	}

}
