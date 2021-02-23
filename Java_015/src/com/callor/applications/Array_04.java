package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] intNums = new int[100];		
		
		System.out.println("숫자 1 ~ 10 중 숫자 를 입력하시요");
		System.out.print("숫자입력>>");
		int keyNum = scan.nextInt();
		
		/*
		 *  변수는 앞에서 어떤 값을 저장했던 상관없이
		 * 가장 마지막에 저장한 값만 가지고 있다
		 * 
		 */
		
		int num = 0;
		num = 100;
		num = 6;
		
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;			
		}
		
		num =  0;
		
		for(int position = 0 ; position < intNums.length ; position++) {
			if(intNums[position] == keyNum) {
				num = position;
				//System.out.println(num);
			}
		}
		// 여기에 오면 num에 저장된 값은 가장 마지막으로 num = position이 실행된 
		// 결과만 담고 있다
		System.out.println(num);
	}
	

}
