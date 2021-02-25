package com.callor.applications;

import java.util.Scanner;

public class Score_01T {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Prompt
		// scanner의 입력 nextInt()를 사용하여
		// 키보드 입력을 받는 코드가 실행되면
		// 화면에 아무것도 없이
		// 멈춘것 처럼 보이는 현상이 있는데
		// 미리 어떤 일을 할 것인지 알려 주는 메세지
		
		System.out.print("국어 점수 >>");
		
		// Bloking 되었다. Code Blocking
		// scan.nestInt() 메서드를 호출하면
		// 코드 동작이 멈추고, 사용자가 키보드로
		// 무엇인가 입력한 후 Enter를 누를 때까지
		// 이후 코드가 실해되지 않는다.
		
		int intKor = scan.nextInt();
		
		System.out.print("영어점수를 입력하세요");
		int intEng = scan.nextInt();
		
		System.out.print("수학점수를 입력하세요");
		int intMath = scan.nextInt();
		
		System.out.println("=======================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		System.out.println(intKor + "\t");
		System.out.println(intEng + "\t");
		System.out.println(intMath + "\t");
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		// fAvg 변수는 실수형 이지만
		// intSumdms 정수형, 3도
		
		float fAvg = intSum / 3;
		
		// 1.intSum 을 실수형으로 변경하고 계산하기
		// 정수형 intSum에 담긴 값을 float 형 값으로 강제 변환하여
		// 나눗셈 준비
				
		fAvg = (float) intSum / 3; // (double)intSum / 3
		
		//2. 숫자 3을 실수형으로 만들어서 나눗셈
		// intSum을 실수 3.0f로 나눗셈을 지시하면 intSum변수에 담긴 값은
		// 자동으로 변환(자동으로 실수형으로 변환된다)
		
		fAvg = intSum / 3.0f; // / 3.0d
		fAvg = intSum / (float)3;
		
		
		System.out.print(intKor + "\t");
		
		
				
				
				
				
				
				
				
	}

}
