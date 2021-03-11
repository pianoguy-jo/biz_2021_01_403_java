package com.callor.oop;
import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("=======================");

		System.out.println("학생 이름을 입력하세요");
		System.out.print(">> ");
		String strName = scan.nextLine();
		scoreVO.strName = strName;

		scoreVO.setIntKor(ssV1.inputScore("국어") + "");
		//scoreVO.setIntEng(ssV1.inputScore("영어" + "");
		// scoreVO.intMath = ssV1.inputScore("수학");

	}

}
		
		
		
		
		
		
		
		
		/*ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		 
		boolean bintEng = scVO.intKor < 50 && scVO.intKor > 100 ;
		boolean bintMath = scVO.intKor < 50 && scVO.intKor > 100 ;
		
		System.out.println("50 ~ 100점 사이의 점수를 입력하시요");
		
		System.out.println("국어 점수>> ");
		String intKor = scan.nextLine();
		scVO.intKor = Integer.valueOf(intKor);
		boolean bintKor = scVO.intKor < 50 && scVO.intKor > 100 ;
		while(!bintKor) {
			System.out.println("잘못 입력했습니다.");
			System.out.println("국어 점수>> ");
			intKor = scan.nextLine();
		}
						
		
			 
			
		
		
		System.out.println("영어 점수>> ");
		scVO.intEng = scan.nextInt();
		
		System.out.println("수학 점수>> ");
		scVO.intMath = scan.nextInt();
		}*/
		
		//System.out.printf("%d\t%d\t%d", scVO.intKor, scVO.intEng, scVO.intMath);
		

