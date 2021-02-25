package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스 extends(확장, 상속)
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 *    부모 클래스에 정의된 모든 method를 코드 한줄로
 *    추가, 수정 없이 그대로 사용할 수 있다.
 *    
 * 추가 extends
 *    부모 클래스에 정의된 method와 새롭게 추가된 method가 있는
 *    확장된 클래스의 생성   
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4 { // extends(확장의 뜻)

	/*
	 * public void intput() {
	 * 
	 * 
	 * 
	 * System.out.println("여기는 ExtendsV1의 input()");
	 * 
	 * }
	 */
	 
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	public int input(String subject) {// intput : 값을 입력하는 프럼프트를 생성하여 입력되어 자장된 값을 출력하는 매소드
		
		Scanner scan = new Scanner(System.in);
		
		
		// Scanner에 입력되어지는 정수를 선언
		int intScore = 0;

		// intScore에 0보다 크고 100보다 작은 수가 입력될때까지 무한 반복
		while(true) {   
			
			 // "점수를 입력"이라는 문자열과 프롬프트 생성
			System.out.print( subject + "점수입력>> ");
			
			// 점수를 입력한 값을 intScore에 저장
			intScore = scan.nextInt();
			
			
			//intScore에 저장된 값이 0보다 작은지 판단함.
			if(intScore < 0) { 
				 // intScore에 저장된 값이 0보다 작은 값이  입력되어지면 Console에 "점수는 0점 이상 입력!!" 문장 출력하고 "점수 입력>>" 문장과 프롬프트가 생성
				System.out.println( subject + "점수는 0점 이상 입력!!");
			
				//intScore에 저장된 값이 100보다 큰 값인지 판단함.
			} else if(intScore > 100) { 

				//intScore에 저장된 값이 100보다 큰 값이 입력되어지면 Console에 "점수는 100점 이하 입력!!" 문장 출력하고 "점수 입력>>" 문장과 프롬프트가 생성
				System.out.println( subject + "점수는 100점 이하 입력!!");
			} else {  
				// intScore에 0보다 크고 100보다 작은 수가 입력되어지면 프로그램을 여기서 중단하고 61라인의 코드로 넘어가게 됨
				break; 
			}
		}
		//System.out.println("입력한 점수 : " + intScore); // intScore에 0보다 크고 100보다 작은 수가 저장된 값을 "입력한 점수 :"와 함께 출력
		return intScore;
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
	}

}
