package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];

		for (int i = 0; i < 10; i++) {

			intNum[i] = rnd.nextInt(100) + 1;
		}

		int intNumSum = 0;
		for (int i = 0; i < 10; i++) {

			intNumSum += intNum[i];			
		}		
		System.out.printf("랜덤수의 합 : %d\n", intNumSum);

		int intEvenSum = 0;
		for (int i = 0; i < 10; i++) {

			boolean dIntNum = intNum[i] % 2 == 0;

			if (dIntNum) { // intnum[i] % 2 == 0으로 표현해도 됨
				intEvenSum += intNum[i];				
			}
		}
		System.out.printf("랜덤 짝수의 합: %d", intEvenSum);
	}
}
