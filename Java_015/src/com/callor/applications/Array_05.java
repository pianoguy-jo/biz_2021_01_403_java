package com.callor.applications;

import java.util.Random;

public class Array_05 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		int index = 0;
		int tfSum = 0;
		for (index = 0; index < intNums.length; index++) {
			intNums[index] = rnd.nextInt(100) + 1;
		}

		boolean bTree = intNums[index] % 3 == 0;
		boolean bFive = intNums[index] % 5 == 0;
		if (bTree == bFive) {
			System.out.println(intNums[index]);

		}
	}

}
