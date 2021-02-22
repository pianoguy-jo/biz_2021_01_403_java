package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	
	/*
	 * 학생 3명의 국어, 영어, 수학 점수를 키보드로 입력받아서 Console에 리스트 출력하기
	 * (intKor, intEng, intMath)
	 * 
	 * 
	 * 1. 학생 3명의 3과목의 점수를 저장할 배열
	 * 2. 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다. 
	 * 3. 학생 3명의 3과목의 점수를 어떻게 입력받을 것인가?
	 * 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가? 
	 */

	public static void main(String args[]) {

		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할 수 있다.
		 * => 3명 학생의 과목점수를 저장해야 하기 때문에 각 과목을 배열로 선언
		 * =>  몇개의 배열이 필요한지 명시(알려주기) = new int [개수];
		 */
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		//[개수] :필요한 개수만큼 배열을 만들어라
		int[] intSum = new int[5];
		int[] intAvg = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		// 3명의 학생의 과목 성적 입력받기
		// 1. 국어 과목의 3학생 점수를 입력받기
		// 2. 학생별로 국어, 영어, 수학 점수를 입력받기
		
		// 1. 과목별로 학생 점수 입력받기
		// 학생 인원수가 몇명 안될때는 아래처럼 단순히 복사해서 붙이기로 코드를 작성해도 된다.
		System.out.println("국어 점수입력");
		System.out.println("1번 학생");
		intKor[0] = scan.nextInt()		;
		
		System.out.println("2번 학생");
		intKor[1] = scan.nextInt()		;
		
		System.out.println("3번 학생");
		intKor[2] = scan.nextInt()		;
		
		
		// for() 반복문을 이용하여 반복되는(복사&붙이기) 코드를 단순하게 만든다.
		System.out.println("영어 점수입력");
		for(int index = 0 ; index < intEng.length ; index++) {
			int num = index +1;
			System.out.println(num + "번 학생 >> ");
			intEng[index] = scan.nextInt();
		}
		
		System.out.println("수학 점수입력");
		for(int index = 0 ; index < intEng.length ; index++) {
			int num = index +1;
			System.out.println(num + "번 학생 >> ");
			intMath[index] = scan.nextInt();
		}
		
		System.out.println("================================");
		System.out.println("국어\t영어\t수학");
		System.out.println("--------------------------------");
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d\t%d\t%d\t\n", intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("================================");

		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Scanner scan = new Scanner(System.in); String[] strsubject = new String[3];
		 * String[] std = new String[3]; int[] intKor = new int[3]; int[] intEng = new
		 * int[3]; int[] intMath = new int[3];
		 * 
		 * std[0] = "01"; std[1] = "02"; std[2] = "03";
		 * 
		 * strsubject[0] = "국어"; strsubject[1] = "영어"; strsubject[2] = "수학";
		 * 
		 * 
		 * 
		 * for(int i = 0 ; i < 3 ; i++) { System.out.printf("국어 점수를 입력하시요 %s", std[i]);
		 * intKor[i] = scan.nextInt(); }
		 * 
		 * for(int i = 0 ; i < 3 ; i++) { System.out.printf("영어 점수를 입력하시요 %s", std[i]);
		 * intEng[i] = scan.nextInt(); }
		 * 
		 * for(int i = 0 ; i < 3 ; i++) { System.out.printf("수학  점수를 입력하시요 %s", std[i]);
		 * intMath[i] = scan.nextInt(); }
		 * 
		 * System.out.println("==============================");
		 * System.out.printf("%s\t%s\t%s", strsubject[0],strsubject[1],strsubject[2]);
		 * System.out.println("------------------------------");
		 * System.out.println("=============================="); System.out.printf("");
		 */

	}

}
