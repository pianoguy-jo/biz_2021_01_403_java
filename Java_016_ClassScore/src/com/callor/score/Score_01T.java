package com.callor.score;

import java.util.Random;

public class Score_01T {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정"};
		String[] strAdd = {"서울시", "익산시","남원시", "한양시", "함흥시"};
		String[] strSub = new String[] {"국어", "영어", "수학"};
		
		int arrLen = strName.length;
		int[] intKor = new int[arrLen]; 
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];
		
		int[] intSum = new int[arrLen];
		float[] floatAvg = new float[arrLen];

		//  점수
		for(int index = 0; index < strName.length; index++) {
			intKor[index] = rnd.nextInt(100) + 1;			
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;
		}		
		
		// 점수의 합		
		for(int index = 0; index < strName.length; index++) {
			intSum[index] = intKor[index];
			intSum[index] += intEng[index];
			intSum[index] += intMath[index];
		}
		// 평균 계산
		for(int index = 0; index < strName.length; index++) {
			floatAvg[index] = (float) intSum[index] / 3;
		}
		
		// 출력
		System.out.println("=====================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		
		// 인적사항 및 점수 출력
		for(int index = 0; index < strName.length; index++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\t\n",
				strName[index],
				strAdd[index],
				intKor[index], 
				intEng[index], 
				intMath[index],
				intSum[index], 
				floatAvg[index]);
		}
		System.out.println("-----------------------------------------------------");
	}
}
