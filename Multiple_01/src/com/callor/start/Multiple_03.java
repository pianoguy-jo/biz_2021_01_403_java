package com.callor.start;

public class Multiple_03 {

	private static int intSum;

	public static void main(String[] args) {
		
		/*int int3M = 0;
		
		for(int i = 0; i < 100; i++) {
			 
			 int num = i + 7;
			 boolean bYes= i % 3 == 0; 
			 
			 
			 if(!bYes) {
				 int3M += num;
				 System.out.println(num);				 			 
				 
			 }
		 }
		System.out.println("3의 배수가 아닌 수의 합" + int3M);
	}
	*/
		int inSum = 0;
		
		for(int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 1;
			if(bYes) {
				intSum += num;
			}
			boolean bYes2 = num % 3 == 2;
			if(bYes2) {
				intSum += num;
			}					
		}
	}
}
