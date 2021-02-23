package com.callor.applications;

import java.util.Scanner;

public class Score_02 {
	public static void main(String[] args) {
		//int intKor = Integer.valueOf(strKor);
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * String[] strSub = new String[4]; strSub[0] = "이름"; strSub[1] = "국어";
		 * strSub[2] = "영어"; strSub[3] = "수학";
		 * 
		 * String[] strName = new String[4]; strName[0] = "홍길동"; strName[1] = "홍길동";
		 * strName[2] = "홍길동";
		 * 
		 * String intKor = new String[3]; int[] intEng = new int[3]; int[] intMath = new
		 * int[3];
		 * 
		 * for(int index = 0 ; index < intKor.length ; index++) {
		 * System.out.printf("%s 점수를 입력하세요>>", strSub[index] + 1); String strKor =
		 * scan.nextLine(); intKor = String.valueOf(strKor); }
		 * 
		 * for(int index = 0 ; index < intKor.length ; index++) {
		 * System.out.printf("%s 점수를 입력하세요>>", strSub[index] + 1); String strEng =
		 * scan.nextLine(); }
		 * 
		 * for(int index = 0 ; index < intKor.length ; index++) {
		 * System.out.printf("%s 점수를 입력하세요>>", strSub[index] + 1); String strMath =
		 * scan.nextLine(); }
		 * 
		 * intKor = Integer.valueOf(strKor);
		 */
		
		Scanner scan = new Scanner(System.in);
		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int intdex = 0 ; intdex < strName.length ; intdex++) {
			System.out.println("학생이름을 입력하세요;");
			strName[intdex] = scan.nextLine();
			
			System.out.println("과목점수를 입력하세요");
			System.out.print("국어");
			
			// 문자열형으로 입력받고
			String strSubj = scan.nextLine();
			//  문자열형숫자를 정수로 변경하여 저장
			intKor[intdex] = Integer.valueOf(strSubj);
			
			System.out.print("영어");
			strSubj = scan.nextLine();
			intEng[intdex] = Integer.valueOf(strSubj);
			
			System.out.print("수학");	
			strSubj = scan.nextLine();
			intMath[intdex] = Integer.valueOf(strSubj);
			
		
		}
		
			
	}

}
