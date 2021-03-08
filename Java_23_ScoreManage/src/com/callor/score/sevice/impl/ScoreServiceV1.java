package com.callor.score.sevice.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.sevice.ScoreService;

public class ScoreServiceV1 implements ScoreService {
	
	private final Random rnd;
	private List<ScoreVO> scoreList;
	private String scoreFileName;
	private ScoreVO scoreVO; 
	
	int[] student = new int[5];
	
	public ScoreServiceV1() {
		this.rnd = new Random();
		scoreVO = new ScoreVO();
		
		scoreList = new ArrayList<ScoreVO>();
		scoreFileName 
			= "src/com/callor/shop/Score.txt";				
	}
	
	
	
	public void loadscoreFromFile() {
		
		int[] kor = new int[5];
		
		for (int i = 0 ; i < student.length; i++) {
			scoreVO[i]. setKor = rnd.nextInt(100) + 1;
			scoreList.add(scoreVO);
 
			 
		}
	
		
	}
	
	
	public void savaScoreToFile() {
	
		
	}
	
	


	public void makerScore() {

		
	}

}
