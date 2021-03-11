package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String args[]) {
		// Random클래스를 사용하여 rnd 객체를 선언하고
		// = new Random() 명령을 사용하여 
		// rnd 객체를 인슨턴스화(化...으로 만든다) 시킨다
		// rnd : Ramdom 클래스의 인슨턴스
		Random rnd = new Random();
		
		//rnd 인슨턴스 nextInt() method를 호출(실행)하라
		// 매개변수값으로 100을 전달 하라
		
		// Random 클래스의 nextInt() method에 정수 100을
		// 전달하고 실행하여 return하는 결과를 num 변수에 저장하라
		// num 변수에는 0 ~99까지 중 1개의 숫자가 저장될 것이다.
		
		int num = rnd.nextInt(100);
		
		// num 변수는 1 ~100 가지 중 1개의 숫자가 저장될 것이다.
		
		num = rnd.nextInt(100) +1;
		
		// 정수 100개를 저장할 배열변수를 선언
		// 생성(초기화:사용할 준비를 하라) 하라
		int[] intNums = new int[100];
		
		// 0 ~ (intNums.length -1) 횟수만큼 반복문을 실행 하겠다
		
		for(int i = 0 ; i < intNums.length ; i++) {
			// intNums의 i 번째 위치에 정수 100을 저장하라
			// i 값은 0 ~ (intNums.length -1)까지 값을
			// 갖게 되므로 전체 배열 100개에 정수 100을 저장하라
			intNums[i] = 100;
		}
		
		
		/*
		 * 0 ~ intNums.length까지의 정수를 만들어서 intNums의 위치값으로 정하고
		 * 
		 * 1 ~ 10까지의 임의 숫자를 생성하여 intNums의 배열에 채워 넣어라
		 */
		for(int i = 0 ; i < intNums.length ; i++) {
			// Random 클랫의 nextInt() method를 호출하면서 정수 10을
			// 전달하고 return된 결과에 1을 더하라
			// 1 ~ 10 까지 중 임의 숫자 1개를 만들어라
			// 임으로 생성된 숫자를 intNums의 i 번째 위치에 저장하라
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
	}
}
	
	
		
		
	   /*
		* Scanner scan = new Scanner(System.in);
		*Random ran = new Random();
		*
		*  100개 요소 저장할 수 있는 정수형 배열 선언 및 생성
		* int[] intNums = new int[100] ;
		*
		* 100개 정수형 배열에 랜덤수 저장
		*for (int i = 0; i < intNums.length; i++) {
		*intNums[i] = ran.nextInt(10) + 1;
		*}
		*
		* 찾고자 하는 숫자 입력
		*System.out.print("숫자를 입력하시요 >> ");
		*int num = scan.nextInt();
		*
		* 입력된 숫자 검색
		*int count = 0;
		*for (int i = 0; i < intNums.length; i++) {
		*boolean bint = intNums[i] == num;
		*
		* 입력된 숫자와 같을 때 카운트
		*if (bint) {
		*count += 1;
		*System.out.print(count + "회 : ");
		*System.out.println(intNums[i]);
		*}
		*}
		*카운트된 갯수 출력
		*System.out.println("입력한 수 " + num + " 갯수 : " + count);
		*/

