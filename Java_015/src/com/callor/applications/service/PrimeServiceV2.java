package com.callor.applications.service;

public class PrimeServiceV2 {

	public int prime(int num) {
		
		// if(소수이면) return num;
		// else return -1
		
		for(int i =2 ; i < num ; i++) {
			// true 이면 소수 아니다
			if(num % i == 0) {
				
				// prime() method 실행을 중단하고
				// main() method에게 -1을 돌려줘라
				return num;
			}
		}
		// num 값이 소수이어서  for() 반복문을 모두 수행하고 
		// 여기에 다다르면 num값을 그대로 return하라
		return -1;
		
		
		/// num 값이 소수이면 return num
		// 아니면 return -1
		
		//if (소수이면) return num;
		//else return -1;
	}
	
	
	
	/*
	 * public int prime(int num) {
	 * 
	 * int index = 0; boolean bYes = true;
	 * 
	 * for (index = 2; index < num; index++) { bYes = num % index == 0; }
	 * 
	 * if (bYes) { return -1; }
	 * 
	 * if (!bYes) {
	 * 
	 * return num; } return index; }
	 */
}
