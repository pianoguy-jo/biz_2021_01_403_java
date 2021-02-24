package com.callor.score;

import java.util.Random;

import com.callor.scrvice.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		Random rnd = new Random();

		String[] strName = new String[] { "홍길동", "이몽룡", "장녹수", "임꺽정" };
		String[] strSubject = { "국어", "영어", "수학" };

		int intLen = strName.length;
		int[] intKor = new int[intLen];
		int[] intEng = new int[intLen];
		int[] intMath = new int[intLen];

		int[] sumKor = new int[intLen];
		int[] sumEng = new int[intLen];
		int[] sumMath = new int[intLen];
		int[] intSum = new int[intLen];
		float[] floatAvg = new float[intLen];

		// 성적 생성
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		// 총점계산
		// ssV1.scoreSum() method를 호출하여 총점 계산

		for (int i = 0; i < strName.length; i++) {
			// ssV1.scorSum() 호출하여 총점
			// 총점을 계산하려면 3과목의 점수를 전달하고
			// 총점 결과를 다시 return 받아서 ... 해야 한다.

			// i번째 학생의 3과목 점수를
			// scoreSum() 전달하고
			// 결과를 다시 i번째 학생의 총점에 저장
			// intSum[I] : i 번재 학생의 총점
			int sum = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
			intSum[i] = sum;
		}

		for (int i = 0; i < strName.length; i++) {
			float avg = ssV1.scoreAvg(intSum[i]);
			floatAvg[i] = avg;
		}

		ssV1.scorePrint(strName, intKor, intEng, intMath, intSum, floatAvg);
	}
}
