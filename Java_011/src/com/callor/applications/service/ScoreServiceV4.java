package com.callor.applications.service;

public class ScoreServiceV4 {

	// 총점과 평균을 전달받는 2개의 매개변수가 있는 score()메서드

	public void score(int intSum, float floatAvg) {
		/*
		 * intSum = 242; floatAvg = 80.666f;
		 */

		// 총점과 평균을 매개변수로 전달받아서
		// Console에 총점과 평균 출력
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);

		/*
		 * 선생님 코드 public void score(int intSum, float floatAvg) {
		 * System.out.println("총점 : " + intSum); System.out.println("평균 : " + floatAvg);
		 */

	}

	public void print(int intKor, int intEng, int intMath) {
		
		// 연산, 계산 부분을 처리
		// 출력부분처리

		int scoreSum = intKor + intEng + intMath;
		
		
		// 아래 코드로 작성해야 (int scoreSum = intKor + intEng + intMath;)코드보다 나중에 관리하기가 편함 
		scoreSum = intKor;
		scoreSum += intEng;
		scoreSum += intMath;
		
		
		
		float scoreAvg = scoreSum / 3; // float scoreAvg = (float)scoreSum / 3 

		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + scoreSum + "\t" + scoreAvg);
		
		
		
		/*
		 * 처리속도가 빠르고 조금 관리가 편한 코드
		 * System.out.println(intKor + "\t"
		 *                    + intEng + "\t"
		 *                    + intMath + "\t"
		 *                    + scoreSum + "\t"
		 *                    + scoreAvg);
		 * 
		 * 처리속도가 조금 느리지만 관리가 편한코드
		 * System.out.print(intKor + "\t");
		 * System.out.print(intEng + "\t");
		 * System.out.print(intMath + "\t");
		 * System.out.print(scoreSum + "\t");
		 * System.out.println(scoreAvg);
		 */

	}

}
