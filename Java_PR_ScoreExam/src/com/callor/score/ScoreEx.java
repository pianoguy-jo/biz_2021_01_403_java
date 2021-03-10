package com.callor.score;

import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		
		ssV1.makeScore(); // 성적입력
		ssV1.saveScoreToFile(); // 성적저장
		ssV1.scoreSumVag(); // 성적합산 및 평균
		ssV1.scorePrint(); // 리스트 출력
		
	}
}
