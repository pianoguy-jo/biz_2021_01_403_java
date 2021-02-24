package com.callor.applications;

import java.util.Scanner;

public class Prime_03 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시요");
		System.out.print(">> ");
		int keyNum = scan.nextInt();
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int result = psV2.prime(keyNum);
		if(result < 0) {
			System.out.println(keyNum + "는 소수가 아님");
		} else {
			System.out.println(keyNum + "는 소수");
		}
		
		
		
		
		
		
		
		
		//Scanner scan = new Scanner(System.in);
		//PrimeServiceV2 psV2 = new PrimeServiceV2();

		
		//System.out.println("숫자를 입력하시요");
		//System.out.print(">> ");
		//int keyNum = scan.nextInt();

		//psV2.prime(keyNum);

		//for()
		//if (keyNum < 0) {
		//System.out.println("약수입니다");
		//} else {
		//System.out.println("소수입니다.");
		//}

	}

}
