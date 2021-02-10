package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
 public static void main(String[] args) {
	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);
	
	
	
	int intRand = rnd.nextInt(100);
	
	System.out.print("숫자를 입력하시요 : ");
	int num1 = scan.nextInt();
	
	
	// 1.keyNum > num1 이냐? 
	// 맞으면 "큰값" 표시하고 종료
	if( num1 > intRand) {
		System.out.println(num1 + "값이" + intRand + "값 보다 큽니다.");
		
		// 2.keyNum > num1 이냐? 
		// 맞으면 "작은값" 표시하고 종료		
	} else	if(num1 == intRand) {
		System.out.println(num1 + "값이" + intRand + "값과 같습니다.");
		
		// 3.keyNum > num1 이냐? 
		// 맞으면 "같은값" 표시하고 종료
	} else if(num1 < intRand){
		System.out.println(num1 + "값이" + intRand + "값 보다 작습니다.");
	}
}
}
