package com.callor.applications;

import java.util.Scanner;

public class App_02 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력( 2 ~ 9 )>> ");
		int dan = scan.nextInt();

		boolean danD = dan > 1;
		boolean danU = dan < 10;

		System.out.println("===========================");
		System.out.println("구구단 " + dan + " 단");
		System.out.println("---------------------------");

		if (!danD) {
			System.out.println("숫자를 잘 못 입력했습니다.");
		} else if (!danU) {
			System.out.println("숫자를 잘 못 입력했습니다.");

		} else if (danD && danU) {
			for (int i = 0; i < 8; i++) {
				int num = i + 2;

				System.out.print(dan);
				System.out.print(" X ");
				System.out.print(num);
				System.out.print(" = ");
				System.out.println(dan * num);
			}

		}

		/*
		 * for(int i = 0 ; i < 8 ; i++) { int num = i + 2;
		 * 
		 * System.out.print(dan); System.out.print(" X "); System.out.print(num);
		 * System.out.print(" = "); System.out.println(dan * num); }
		 * System.out.println("===========================");
		 */

	}

}
