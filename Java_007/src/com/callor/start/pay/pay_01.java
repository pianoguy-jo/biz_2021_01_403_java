package com.callor.start.pay;

public class pay_01 {

	public static void main(String arge[]) {
		
		// 5만원권 계산
		int pay = 4_789_800;
		int paper = 50_000;
		
		int count = pay /paper; //95
		System.out.println( paper + "원권 : " + count );
		
	    // for() 반복문이 무한 반복된다.
		// for() 문을 종료하는 조건을 부여해야 한다.
		
		for(;pay > 0;) {
						
			pay -= (paper * count); // 95*5=475 (39800)
			paper = paper / 5;//50000/5=10000
			count = pay / paper;
			System.out.println(paper + "원권 : " + count);
			
			if(pay < pay * count) {
				pay -= (paper * count);
				paper = paper / 2;
				count = pay / paper;
				System.out.println(paper + "원권 : " + count);	
			}
		}
	}
}
