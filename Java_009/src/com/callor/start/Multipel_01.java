package com.callor.start;

public class Multipel_01 {

	public static void main(String arge[]) {
		/*
		 * int var = 0;
		 * 
		 * for(int i =0 ; i < 100 ; i++) {
		 * 
		 * 
		 * boolean bcr = i % 3 == 0 && i % 9== 0;
		 * 
		 * if(bcr) {
		 * 
		 * System.out.println(i); var += i;
		 * 
		 * } } System.out.println(var);
		 */

		// 1 ~ 100 까지 범위에서 찾아
		for (int i = 0; i < 100; i++) {

			int intSum = i + 1;

			boolean bYes3M = i % 3 == 0;
			boolean bYes9M = i % 9 == 0;

			// 3의 배수이면서(and) 9의 배수
			if (bYes3M && bYes9M) {
				intSum += 1; // i를 더하지 않는다.
				System.out.println(intSum + "는 3과 9의 배수");
			}
			System.out.println("3과 9의 배수합 : " + intSum);
			System.out.println("=======================");
		}

		for (int i = 0; i < 100; i++) {

			int intSum1 = i + 1;

			boolean bYes3M = i % 3 == 0;
			boolean bYes9M = i % 9 == 0;

			// if() 비교연산문을 중복 처리하는 방식
			if (bYes3M) {
				if (bYes9M) {
					intSum1 += 1;
					System.out.println(intSum1);
				}
			}
			System.out.println("3과 9의 배수합 : " + intSum1);
		}
	}
}
