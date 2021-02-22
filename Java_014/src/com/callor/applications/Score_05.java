package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		
		// 학생이름이 미리 정해진 경우
		// 개수를 지정하지 않고 값들(이름들)을 지정하여 배열선언하기
		
		String[] strName = new String [] {"홍길동","이몽룡","성춘향"};
		// 학생 이름 배열수 개수만큼 과모성적을 지정 배열 선언
		
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		
		// 학생이름 배열 개수만큼 총점과 평균을 계산 저장할 배열 선언
		int [] intSum = new int[strName.length];
		float [] floatAvg = new float[strName.length];
		
		Random rnd = new Random();
		
		// 학생별로 점수를 입력하는 부분
		for(int i = 0 ; i < strName.length ; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;			
		}
		
		
		// 학생별로 총점을 계산하는 코드
		for(int i = 0 ; i < strName.length ; i++) {
			 intSum[i] =
			 intKor[i] +
			 intEng[i] +
			 intMath[i];			 					 
		}
		
		// 학생별로 평균을 계산을 하는 코드
		for(int i = 0 ; i < strName.length ; i++) {
			floatAvg[i] = (float) intSum[i] / 3;			
		}
		
		// 성적리스트 제목 출력
		System.out.println("=============================================");
		System.out.println("빛나리 학습 성적일람표");
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");		
		// 성적리스트 출력
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",
					strName[i],intKor[i],intEng[i],intMath[i],intSum[i],floatAvg[i]);
		}	
		
		
		
		
		
		
		
		
		/*
		 * Random ran = new Random(); String[] strName = new String[]
		 * {"홍길동","이몽룡","성춘향"}; int[] intKor = new int[3]; int[] intEng = new int[3];
		 * int[] intMath = new int[3]; int[] sum = new int[3]; float[] avg = new
		 * float[3];
		 * 
		 * for(int index = 0 ; index < strName.length ; index++) { intKor[index] =
		 * ran.nextInt(100); intEng[index] = ran.nextInt(100); intMath[index] =
		 * ran.nextInt(100); sum[index] = intKor[index] + intEng[index] +
		 * intMath[index]; avg[index] = (float)sum[index] / 3; }
		 * 
		 * 
		 * System.out.println("=============================================");
		 * System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		 * System.out.println("---------------------------------------------"); for(int
		 * index = 0 ; index < 3 ; index++) {
		 * System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[index],
		 * intKor[index], intEng[index], intMath[index], sum[index], avg[index]); }
		 * System.out.println("---------------------------------------------");
		 */		
		
		
		
		
	}

}
