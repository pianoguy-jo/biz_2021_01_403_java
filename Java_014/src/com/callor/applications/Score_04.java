package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Score_04 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
				
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
						
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int index = 0 ; index < strName.length ; index++) {
			
			intKor[index] = ran.nextInt(100);
		
			intEng[index] = ran.nextInt(100);
			
			intMath[index] = ran.nextInt(100);
		}
		System.out.println("==============================");
		System.out.println("이름\t어\t영어\t수학");
		System.out.println("------------------------------");		
		for(int index = 0 ; index < 3 ; index++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[index], intKor[index], intEng[index], intMath[index]);			
		}
		System.out.println("------------------------------");
	}

}
