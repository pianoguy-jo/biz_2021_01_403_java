package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String args[]) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];

		System.out.println("숫자 1 ~ 10까지의 숫자를 입력하시요");
		System.out.print("숫자입력 >> ");
		int keyNum = scan.nextInt();
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		for (int position = 0; position < intNums.length; position++) {

			if (intNums[position] == keyNum) {
				System.out.println(position);
				break;
			}

		}

	}

}
