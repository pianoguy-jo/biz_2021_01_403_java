package com.callor.score;

import com.callor.score.model.ScoreVO;
import com.callor.scrvice.ScoreServiceV2;

public class Score_04 {
	
	public static void main(String[] args) {
		 ScoreServiceV2 ssV2 = new ScoreServiceV2();
		 ScoreVO 홍길동성적 = new ScoreVO();
		 
		 홍길동성적.intKor = 90;
		 홍길동성적.intEng = 88;
		 홍길동성적.intMath = 77;
		 홍길동성적.intMusic = 77;
		 홍길동성적.intHistory = 77;
		 
		 int sum = ssV2.scoreSum(0, 0, 0, 0, 0, 0);
		 
	}

}

