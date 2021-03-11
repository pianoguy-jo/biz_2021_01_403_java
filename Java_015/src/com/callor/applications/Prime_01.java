package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int num = 0; boolean bNum = true;// false;
		 * 
		 * for (int i = 0; i < 100; i++) { System.out.print("2이상의 정수를 입력하시요 : "); num =
		 * scan.nextInt(); System.out.println();
		 * 
		 * bNum = num % 3 == 0;// && num % 3 == 1;
		 * 
		 * if (bNum) { System.out.println("약수입니다."); System.out.println();
		 * 
		 * } else if (!bNum) { System.out.println("소수입니다."); System.out.println();
		 * 
		 * }
		 * 
		 * }
		 */
		int keyNum = 0;
		int pos = 0;
		for(int index = 2 ; index < keyNum ; index++) {
			if(keyNum % pos == 0) {
			break;
		}
		
		
		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break되면
		// 항상 pos < keyNum 관계가 된다

		
		//if(pos == KeyNum) {소수인경우}
		
		// 조건문이 하늘이 무너져도
		// ture
		if(pos < keyNum) {
			System.out.println(keyNum + " 는 소수가 아님");

		// for 반복문이 break 없이 모두 완료되었으면	
		} else {
			System.out.println(keyNum + "는 소수임");
		}

	}
	}
}