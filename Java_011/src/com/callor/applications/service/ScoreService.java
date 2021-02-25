package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 method() 호출
 * ScoreService 클래스에는 main() method가 없어서 여기에 있는 코드는 직접
 * Ran(^F11)하여 실행할 수 없다
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고
 * score() method를 호출해주어야만 코드를 실행 할 수 있다.
 * 
 * 다른 언어에서는 module등의 이름으로 사용한다.
 */

public class ScoreService {
	
	/*
	 * 클래스와 메서드(메소드, method)의 명명법
	 * 클래스 ; 첫글자 영문대문자, 이후 염문대소문자 숫자
	 * 메서드 : 첫글자 영문소문자, 이후 영문대소문자 숫자
	 * 
	 * 클래스 명명법 Upper CamelCase 라고 한다  어퍼 카멜스
	 * 메서드 명명법 Lower CamelCase 라고 한다  로우 카멜스
	 */
	
	public void score() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하시요");
		int intKor = scan.nextInt();
		
		System.out.print("영어 점수를 입력하시요");
		int intEng = scan.nextInt();
		
		System.out.print("수학 점수를 입력하시요");
		int intMath = scan.nextInt();
		
		int sumTol = intKor;
		sumTol += intEng;
		sumTol += intMath;
		
		float fAvg = sumTol / 3f;
		
		System.out.print(sumTol + "\t");
		System.out.print(fAvg);
		
		
		
		
		
		
		
	}

}
