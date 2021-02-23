package com.callor.applications.service;

import java.util.Random;

public class HomeWork_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[100];

		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int result = 0;
		for (int i = 0; i < intNums.length; i++) {
			int rndNum = psV2.prime(rnd.nextInt(100) + 1);
			intNums[i] = rndNum;

			if (intNums[i] > 0) {
				result += intNums[i];
				System.out.print(intNums[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("합 : " + result);
	}
}
