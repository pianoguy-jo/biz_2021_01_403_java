package com.callos.start;

public class Odd_Even_01 {

	public static void main(String args[]) {
		int sum = 0;// 짝수
		int intSumOdd = 0; // 홀수
		int sum2 = 0;// 3의 배수
		// 짝수
		for (int i = 0; i < 100; i++) {

			int num = i + 1;
			boolean bYes = num % 2 == 1;

			if (bYes) {
				sum += i;
			}
		}
		System.out.println("짝수" + sum);

		// 홀수
		for (int i = 0; i < 100; i++) {

			int num = i + 1;
			boolean bYes = num % 2 == 0;

			if (!bYes)

			{
				intSumOdd += num;
			}
		}

		System.out.println("홀수" + intSumOdd);

		// 3의 배수
		for (int i = 0; i < 100; i++) {

			
			int num = i + 6;
			boolean bYes = num % 3 == 0;

			if (bYes) {System.out.println("3의 배수" + num);
				sum2 += num;
			}

			
		}
		System.out.println("3의  배수의 합" + sum2);
	}
}