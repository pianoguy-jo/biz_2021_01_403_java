package com.callor.applications.service;

import java.util.Random;

public class HomeWork_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[100];

		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int rndNum = 0;
		int result = 0;
		int numSum = 0;
		for (int i = 0; i < intNums.length; i++) {
			rndNum = rnd.nextInt(100) + 1;
			result = psV2.prime(rndNum);
			intNums[i] += rndNum;

			if (result < 0) {
				System.out.print(intNums[i] + ", ");
				numSum += intNums[i];
			}
		}
		System.out.println();
		System.out.println("합 : " + numSum);
	}
}
