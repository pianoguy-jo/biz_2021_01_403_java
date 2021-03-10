package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.ScoreVO;
import com.callor.score.service.ScoreServoce;

public class ScoreServiceImplV1 implements ScoreServoce{
	
	private List<ScoreVO> scoreList;
	private Scanner scan;
	static String scoreFile;
	private ScoreVO sVO;

	public ScoreServiceImplV1() {
		
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		scoreFile = "src/com/callor/score/data/score.txt";
		
	}
	
	
	public void makeScore() {
		

		
		System.out.println("=================");
		System.out.println("성적입력");
		System.out.println("-----------------");
		
		
		while(true) {
		ScoreVO scVO = new ScoreVO();
		System.out.println("입력을 끝내고 싶으면 QUIT를 입력하세요");	
		System.out.print("학번 입력 >>");
		String strNum = scan.nextLine();
			
		if(strNum.equals(scVO.getsNum())) {
			System.out.println("학번이 중복됩니다. 다른 학생의 학번을 입력하세요");
			System.out.println("학번 다시 입력");
			strNum = scan.nextLine();
			
		} else if(strNum.equals("QUIT")) {
			break;
		}	
		
		
		System.out.print("국어점수 입력 >>");	
		String strKor = scan.nextLine();
		int intKor = 0;
		try {
			
			intKor = Integer.valueOf(strKor);
			
			if(intKor < 0 ){
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 0점이상 100점 이하로 입력하세요");
				System.out.print("국어점수 입력>>");
				strKor = scan.nextLine();
				
				
			} else if (intKor > 100) {
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 100점이하로 입력하세요");
				System.out.print("국어점수 입력>>");
				strKor = scan.nextLine();
				
			}
			
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		
		
		
		System.out.print("영어점수 입력 >>");
		String strEng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(strEng);
			
			if(intEng < 0 ){
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 0점이상 100점 이하로 입력하세요");
				System.out.print("영어점수 입력>>");
				strEng = scan.nextLine();
				
				
				
			} else if (intEng > 100) {
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 100점이하로 입력하세요");
				System.out.print("영어점수 입력>>");
				strEng = scan.nextLine();
				
				
			}
			
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}		
		
		
		System.out.print("수학점수 입력 >>");
		String strMeth = scan.nextLine();
		int intMeth = 0;
		try {
			intMeth = Integer.valueOf(strMeth);
			
			if(intMeth < 0 ){
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 0점이상 100점 이하로 입력하세요");
				System.out.print("수학점수 입력>>");
				strMeth = scan.nextLine();
				
				
				
			} else if (intMeth > 100) {
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 100점이하로 입력하세요");
				System.out.print("수학점수 입력>>");
				strMeth = scan.nextLine();
				
				
			}
			
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		
		
		
		System.out.print("음악점수 입력 >>");
		String strMusic = scan.nextLine();
		int intMusic = 0;
		try {
			intMusic = Integer.valueOf(strMusic);
			
			if(intMusic < 0 ){
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 0점이상 100점 이하로 입력하세요");
				System.out.print("음악점수 입력>>");
				strMusic = scan.nextLine();
				return;
				
				
			} else if (intMusic > 100) {
				System.out.println( " 점수를 잘못 입력했습니다.");
				System.out.println("점수는 100점이하로 입력하세요");
				System.out.print("음악점수 입력>>");
				strMusic = scan.nextLine();
				return;
				
			}
			
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		
				
		
		scVO.setsNum(strNum);
		scVO.setKor(intKor);
		scVO.setEng(intEng);
		scVO.setMeth(intMeth);
		scVO.setMusic(intMusic);
		scoreList.add(scVO);	
		
		}
	}
		
		
	

	@Override
	public void saveScoreToFile() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			
			fileWriter  = new FileWriter(scoreFile);
			printer = new PrintWriter(fileWriter);
			
			for(ScoreVO vo : scoreList) {
				printer.print(vo.getsNum() + ",");
				printer.print(vo.getKor() + ",");
				printer.print(vo.getEng() + ",");
				printer.print(vo.getMeth() + ",");
				printer.print(vo.getMusic() + "," + "\n");			
				
			}
			
			printer.close();
			fileWriter.close();
			System.out.println("파일생성성공");
			
		} catch (Exception e) {
			
			System.out.println("파일생성 실퍠");
		}
		
		
		
	}

	@Override
	public void scoreSumVag() {
		
		
		for(ScoreVO sVO : scoreList) {
			
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMeth();
			sum += sVO.getMusic();			
			float avg = (float) sum / 4;
			
			sVO.setTotal(sum);
			sVO.setAvg(avg);
			
		}

		
	}

	@Override
	public void scorePrint() {
		

		
		System.out.println("=======================================================");
		System.out.println("성적일람표");
		System.out.println("-------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		
		for(ScoreVO sVO : scoreList) {
			
			System.out.print(sVO.getsNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMeth() + "\t");
			System.out.print(sVO.getMusic() + "\t");			
			
			System.out.print(sVO.getTotal() + "\t");
			System.out.printf("%3.2f\t\n", sVO.getAvg());
			
			
		}
		
		for(ScoreVO sVO : scoreList) {
			System.out.println("-------------------------------------------------------");	
			System.out.println("총점: " + sVO.getTotal());
			System.out.printf("평균: %3.2f\n", sVO.getAvg());
			
		}
			
		
		System.out.println("=======================================================");
		
		
	}

}
