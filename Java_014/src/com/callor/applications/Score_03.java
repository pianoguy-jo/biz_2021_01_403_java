package com.callor.applications;

import java.util.Scanner;

public class Score_03 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		
		
				
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int index = 0 ; index < strName.length ; index++) {
			System.out.printf("%S 국어 점수 >>", strName[index]);
			String strKor = scan.nextLine();
			intKor[index] = Integer.valueOf(strKor);
			
			System.out.printf("%S 영어 점수 >>", strName[index]);
			String strEng = scan.nextLine();
			intEng[index] = Integer.valueOf(strEng);
			
			System.out.printf("%S 수학 점수 >>", strName[index]);
			String strMath = scan.nextLine();
			intMath[index] = Integer.valueOf(strMath);
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
