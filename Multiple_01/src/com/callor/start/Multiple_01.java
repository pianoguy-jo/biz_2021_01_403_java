package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {
		
		int int3M = 0;
		
		for(int i = 0; i < 100; i++) {
			 
			 int num = i + 7;
			 boolean bYes= i % 3 == 0; 
			 
			 
			 if(!bYes) { // if(num % 3 == 0) / if(bYes == true) 같이 쓸수 있음
				 int3M += num;
				 System.out.println(num);
				 			 
				 
			 }
		 }
		System.out.println("3의 배수가 아닌 수의 합" + int3M);
	}
}
