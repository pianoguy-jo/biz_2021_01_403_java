package com.callor.start.logic;

public class Logic_06_1 {

	public static void main(String arge[]) {
		
		// 5만원권 계산
		int pay = 4_789_800;
		int paper = 50_000;
		
		int sw = -1;	
		for(int i = 0 ;pay > 0 ;i++) {
			int count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권 : " + count);
			
			if(i % 2 ==0) {// i가 짝수이면
				paper = paper / 5;
			} else { // 그렇지 않으면
				paper = paper / 2;
			}
			sw *= (-1);
			
			
			
		
		}
	}
}
