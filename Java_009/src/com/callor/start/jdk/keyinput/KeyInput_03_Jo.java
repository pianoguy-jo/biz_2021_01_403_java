package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03_Jo {
	public static void main(String args[]) {
		
		Random rand = new  Random();
		Scanner scan = new Scanner(System.in);
		
		int intRand = rand.nextInt(100) +1;
		
		System.out.print("숫자입력 : ");
		int num1 = scan.nextInt();
		
		if( num1 > intRand) {
			System.out.println(num1 + "값이" + intRand + "값 보다 큽니다.");
		}
		if(num1 == intRand) {
			System.out.println(num1 + "값이" + intRand + "값과 같습니다.");
		} else {
			System.out.println(num1 + "값이" + intRand + "값 보다 작습니다.");
		}
		
		
		
	}

}
