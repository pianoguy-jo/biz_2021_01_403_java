package com.callor.applications.service;

import java.util.Scanner;

public class Prine_02 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		
		System.out.println("숫자를 입력하시요");
		int num = scan.nextInt();
		psV1.prime(num);
		
	}

}
