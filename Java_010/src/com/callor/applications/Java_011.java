package com.callor.applications;

import java.util.Scanner;

public class Java_011 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int sum = 0;
		float tol = 0f;
		
		
		// 국어 점수 입력
		System.out.print("국어 점수를 입력하시요(0~100) : ");
		int scanNum1 = scan.nextInt();
		
		if(scanNum1 > 100) { // 입력이 잘 못 되었을때
			
			System.out.println("점수를 잘못 입력했습니다.");
			System.out.println("점수 범위는 1 ~ 100 입니다.");
			System.out.print("국어 점수를 입력하시요(0~100) : ");
			int scanNum2 = scan.nextInt();
			num1 = scanNum2;
			System.out.println();
			
			
		} else if (scanNum1 <= 100){
		
			num1 = scanNum1;
		}		
		
		//영어 점수 입력
		System.out.print("영어 점수를 입력하시요(0~100) : ");
		int scanNum2 = scan.nextInt();
		
		if(scanNum2 > 100) {// 점수를 잘 못 입력했을 때
			
			System.out.println("점수를 잘못 입력했습니다.");
			System.out.println("점수 범위는 1 ~ 100 입니다.");
			System.out.print("국어 점수를 입력하시요(0~100) : ");
			int scanNum5 = scan.nextInt();
			num1 = scanNum1;
			System.out.println();
			
		} else if (scanNum2 <= 100 ) {
			num2 = scanNum2;
		}
		
		// 수학점수 입력
		System.out.print("수학 점수를 입력하시요(0~100) : ");
		int scanNum3 = scan.nextInt();
		
		if(scanNum3 <= 100) {
			num3 = scanNum3;
		}
		
		sum = num1 + num2 + num3;
		tol = sum / 3;
		
		System.out.println("=======================================");
		System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t");
		System.out.println("---------------------------------------");
		System.out.print(num1 + "\t");
		System.out.print(num2 + "\t");
		System.out.print(num3 + "\t");
		System.out.print(sum + "\t");
		System.out.println(tol + "\t");
		System.out.println("=======================================");
		
	}

}
