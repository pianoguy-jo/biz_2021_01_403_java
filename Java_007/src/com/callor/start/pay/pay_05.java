package com.callor.start.pay;

public class pay_05 {

	public static void main(String arge[]) {
		
		// 5만원권 계산
		int pay = 4_789_800;
		int paper = 500_000;
		
		int sw = -1;
		
		// 일반적을 for() 반복문은 반복되는 횟수가 명확할때 사용함
		// while(조건문) 반복문은 반복되는 횟수가 경우에 따라 다를 때상용
		//               조건에 부여하여 반복 수행을 결정
        //                조건문이 true 일때 반복하고, 조건문 false가 되면 종료한다.
		
		While (pay > 0) {
			int count = pay / paper;
			pay -= (paper *count);
			
		}
	}
		}
