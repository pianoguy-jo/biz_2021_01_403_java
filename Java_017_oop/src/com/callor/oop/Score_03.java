package com.callor.oop;
import java.util.Scanner;
import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		 while(true) {			 
			 System.out.println("국어점수를 입력하세요");
			 System.out.print(">> ");
			 String strKor = scan.nextLine();			 
			 scoreVO.setIntKor(strKor);
			 
			 // intKor에 -이 담겨 있으면 다시 입력을 하도록해야한다.
			 
			 if(scoreVO.getIntKor < 0) {
				 System.out.println("국어점수 유효성 검사 실패");
				 
				 continue;
			 }
			 break;
		 }
		
		 while(true) {			 
			 System.out.println("영어점수를 입력하시요");
			 System.out.println(">>");
			 String strEng = scan.nextLine();
			 scoreVO.setIntEng(strEng);
			 if(scroeVO.getIntEng() < 0) {
				 System.out.println("영어점수 유효성 검사 실패");
				 continue;
			 }break;
			 
		 }
		 
		
	}
}