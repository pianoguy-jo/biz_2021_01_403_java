package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;			
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int positon = 0 ; positon < intNums.length ; positon++) {
			if(intNums[positon] == keyNum){
				System.out.print(positon);
			}
			
		}
		
		
	}
	/*
	 * public static void main(String[] args) { Random rnd = new Random(); Scanner
	 * scan = new Scanner(System.in);
	 * 
	 * int[] intNums = new int[100]; int num = 0; for (int i = 0; i <
	 * intNums.length; i++) {
	 * 
	 * intNums[i] = rnd.nextInt(10) + 1; }
	 * 
	 * System.out.println("1 ~ 10의 숫자를 입력하시요"); System.out.print("숫자입력 >>"); int
	 * intKey = scan.nextInt(); for (int i = 0; i < intNums.length; i++) {
	 * //System.out.println((i +1)+ "번째" +"담긴 숫자 출력" + intNums[i]); boolean bYes =
	 * intNums[i] == intKey;
	 * 
	 * if (bYes) { System.out.println(i); break; //intKey 같은 숫자가 나타나면 중단 } } }
	 */
}
