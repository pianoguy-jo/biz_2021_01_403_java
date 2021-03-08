package com.callor.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.values.Values;

public class Sort_04 {
	
	public static void main(String[] args) {
		
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
			
		
		for(int i = 0 ; i < 10 ; i++) {
			
			int sum = 0;
			int[] subs = new int [5];
			
			for(int j = 0 ; j < subs.length; j++) {
				subs[j] = rnd.nextInt(100)+1;
				sum += subs[j];
				
				
			}
			
			
			float avg = (float)sum / 5;
			ScoreVO vo = new ScoreVO(
					String.format("%5d", i + 1),
					Integer.valueOf(subs[0]),
					Integer.valueOf(subs[1]),
					Integer.valueOf(subs[2]),
					Integer.valueOf(subs[3]),
					Integer.valueOf(subs[4])				
					
					);
			
			vo.setTotal(sum);
			vo.setAvg(avg);
			scoreList.add(vo);
			
			
		}
		for(ScoreVO vo : scoreList) {
			System.out.println(scoreList.toString());	
			
		}
		// 총점 순으로 정렬
		
		int nSize = scoreList.size();
		
		for(int i = 0 ; i < nSize ; i++) {
			
			for(int j = i + 1 ; j < nSize ; j++) {
				ScoreVO vo_i = scoreList.get(i);
				ScoreVO vo_j = scoreList.get(j);
				 
				 // total 값을 비교하여
				 // scoreList
				 if (vo_i.getTotal() > vo_j.getTotal()) {
					 
					 ScoreVO temp = scoreList.get(i);
					 scoreList.set(i, scoreList.get(j));
					 scoreList.set(i, temp);
				 }
				
				
			}
		}
		
		System.out.println(Values.dLine);
		for(ScoreVO vo : scoreList) {
			System.out.println(vo.toString());
			
		}
		
		// 총점순으로 내림차순 정렬된 리스트의
		// 각 요소(vo)의 rank 변수에 순서대로 1 ~ 저장
		// 순위가 설정
		for(int i = 0 ; i < nSize; i++) {
			
			scoreList.get(i).setRank(i + 1);
		}
		
		for(ScoreVO vo : scoreList) {
			
			System.out.println(vo.toString());
		}
	}

}
