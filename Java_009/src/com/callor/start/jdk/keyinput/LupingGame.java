package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

/*
 * 배경설명 : 알아서 만듬
 * 1. Random 클래스를 사용하여 1~ 100까지 임의 숫를
 * 생성하여 변수에 담아 놓는다.
 * 
 * 2. Console에 "숫자입력>>" 프롬프트를 보여주고
 * 3. 1 ~ 100까지 정수를 입력받는다.
 * 4. 입력 받은 정수와  rndNum 변수에 저장된 값을 비교하여
 * 5. 큰가, 작은가를 알려주고
 * 6. rndNum에 저장된 값을 맞추는 게임
 * 
 * 7. 2 부터 5까지를 계속 반복하면서 값을 맞춘다.
 * 8. 만약 정수 값에 -1을 입력하면 게임을 중단한다.
 */

public class LupingGame {
	public static void main(String args[]) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rndNum = rnd.nextInt(100) + 1;
		int count = 0;
		int i = 1;
		while(true) {
			System.out.println("숫자입력 (-1:Quit)>> ");
			int keyNum = scan.nextInt();
			count = i++;
			
			if(keyNum < 0) {
				System.out.println("You lose!!");
				break;
			}
			if(keyNum == rndNum) {
				if(count > 10) { 
					System.out.println("You Win!!");
					System.out.println(count + "당신은 재능이 없네요");	
				}
				
				else if(count < 5) {
					System.out.println("You Win!!");
					System.out.println(count + "좀 한듯.");
				}
				
				else if(count < 3) {
					System.out.println("You Win!!");
					System.out.println(count + "당신은 점쟁이?");
				}
				
				else if(count == 1) {
					System.out.println("You Win!!");
					System.out.println(count + "신인듯");
				}				
				
			} else if(keyNum > rndNum) {
				System.out.println("입력값이 크다");
				
			}else if(keyNum < rndNum) {
				System.out.println("입력값이 작다");
				
		}// whie end
		System.out.println("GAME ORVER");
	}
}
}	