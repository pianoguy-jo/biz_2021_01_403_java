package com.callor.student;


/*
 * =======================
 * 구구단 7단
 * ------------------
 * 
 * 7 X 1 = 7
 * 7 X 2 = 
 * 7 X 3 = 
 * 7 X 4 = 
 * 7 X 5 = 
 * 7 X 6 = 
 * 7 X 7 = 
 * 7 X 8 = 
 * 7 X 9 =
 */
public class Ex_10 {
	
	public static void main (String args[]) {
	
		int dan = 7;
		
		for (int i = 0 ; i < 9 ; i++) {
			int num = i + 1;
			System.out.println(dan + "X" + (i+1) + "=" + (dan * num));
		}
	
	}

}
