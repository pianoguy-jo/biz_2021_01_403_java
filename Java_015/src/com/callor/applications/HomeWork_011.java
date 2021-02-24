package com.callor.applications;

import java.util.Random;

public class HomeWork_011 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[100];

		PrimeServiceV2 psV2 = new PrimeServiceV2();

		
		// 이 두개의 변수는 for() 반복문에서 수행한 연산
		// 덧셈, 개수세기를 수행한 후
		// 결과를 출력하는 곳에서 사용해야할 변수이다.
		// 
		int numSum = 0; 
		int intCount = 0;
		// 임의의 난수 100개를 정수정렬에 저장
		for (int index = 0; index < intNums.length; index++) {

			// 0~99까지의 난수를 생성하고 생성된 난수에 +2를 수행하라
			// 실제 생성된 수는 2 ~ 101까지 중에 난수를 생성하여 intNums[index]에 저장
			intNums[index] = rnd.nextInt(100) + 1;

		}

		// 임의의 정수 100개중 소수인 리스트 출력
		for (int index = 0; index < intNums.length; index++) {
			if (psV2.prime(intNums[index]) > 0) {
				System.out.print(intNums[index] + ", ");
			}
		}

		
		// 임의의 정수 100개중 소수인 리스트의 합 출력
		for (int index = 0; index < intNums.length; index++) {
			numSum += intNums[index];
		}
		System.out.println();
		System.out.println("합 : " + numSum);
	}
}
