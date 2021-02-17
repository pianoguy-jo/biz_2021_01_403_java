package com.callor.start;

import java.util.Scanner;

public class edit {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int dan = scan.nextInt();
		
		boolean bTow = dan >=2;
		boolean bNin = dan <=9;
		
		if (bTow == bNin) {
			System.out.println("===============");
			System.out.println("구구단 " + dan + " 단");
			System.out.println("---------------");
			
			for(int i = 0 ; i < 9 ; i++) {
				int num = i +2;
				System.out.print(dan);
				System.out.print(" X ");
				System.out.print(num);
				System.out.print(" = ");
				System.out.println(dan * num);
				
			}
		}else if ( bTow != bNin) {
			System.out.println("숫자를 잘못 입력했습니다.");			
		}
		
		
	}

}
