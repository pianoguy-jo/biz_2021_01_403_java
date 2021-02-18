package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {
	
	// java에서는 인슨턴스 변수를 private 으로 제한한다.
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	/*
	 * scope()에서는 1개의 숫자를 키보드에 입력받아 변수 intNum1에 저장한다.
	 * 한지만 여기에서 선언된 intNum1은
	 * 클래스 영역에 선언된 인스턴스 변수와는 이름만 같지 완전히 다른 변수다
	 * 
	 * 따라서 scope() method가 종료된 이후에는 변수값에 접근할 수 없다.
	 * scope() method에서 선언된 intNum1변수를 지역변수라고 한다.
	 * 
	 */
	public void scope() {
		
		System.out.print("숫자를 입력하세요");
		int intNum1 = scan.nextInt();
		
		// method 선언명령문에 void 키워드 
		
	}
	
	public void input() {
		System.out.println("숫자 1을 입력하세요 >>");
		int intNum1 = scan.nextInt();
		
		System.out.println("숫자 2을 입력하세요 >>");
		int intNum2 = scan.nextInt();
		return;
	}
	
	public void algebra() {
		
		  System.out.print(intNum1);
		  System.out.print(" + ");
		  
		  if (3> 3) {
			  return; //여기서 끝내라
		  }
		  
		  System.out.print(intNum2);
		  System.out.print(" = ");
		  System.out.println(intNum1 + intNum2);
		  
		  /*
		   * print formatting 명령문
		   * "" 안에 문자열을 작성하여 출력문을 만드는 명령문
		   * %d(Decimal) 위치에 정수값을 대신 부착하여 출력문 생성
		   */
		  
		  System.out.printf(" %d + %d = %d \n",
				  intNum1,
				  intNum2,
				  intNum1 + intNum2);
		  
		  System.out.printf(" %d - %d = %d \n",
				  intNum1,
				  intNum2,
				  intNum1 - intNum2);
		  
		  System.out.printf(" %d * %d = %d \n",
				  intNum1,
				  intNum2,
				  intNum1 * intNum2);
		  
		  System.out.printf(" %d / %d = %d \n",
				  intNum1,
				  intNum2,
				  intNum1 / intNum2);
		
	}
		
	
	

	/*
	 * private int intNum1 = 0;
	 * private int intNum2 = 0;
	 * private Scanner scan = new Scanner(System.in);
	 * 
	 * public void input() {
	 *  System.out.print("첫번째 숫자를 입력하시요 : ");
	 *  intNum1 = scan.nextInt();
	 * 
	 * System.out.print("두번째 숫자를 입력하시요 : ");
	 * intNum2 = scan.nextInt();
	 * }
	 * 
	 * public void algebra() {
	 * 
	 * int num1 = intNum1 + intNum2; 
	 * System.out.print(intNum1);
	 * System.out.print(" + "); 
	 * System.out.print(intNum2); 
	 * System.out.print(" = ");
	 * System.out.println(num1);
	 * 
	 * int num2 = intNum1 - intNum2; 
	 * System.out.print(intNum1);
	 * System.out.print(" - "); 
	 * System.out.print(intNum2); 
	 * System.out.print(" = ");
	 * System.out.println(num2);
	 * 
	 * int num3 = intNum1 * intNum2; 
	 * System.out.print(intNum1);
	 * System.out.print(" X "); 
	 * System.out.print(intNum2); 
	 * System.out.print(" = ");
	 * System.out.println(num3);
	 * 
	 * float num4 = intNum1 / intNum2;
	 * System.out.print(intNum1);
	 * System.out.print(" / "); 
	 * System.out.print(intNum2); 
	 * System.out.print(" = ");
	 * System.out.println(num4);
	 * 
	 * }
	 */

}
