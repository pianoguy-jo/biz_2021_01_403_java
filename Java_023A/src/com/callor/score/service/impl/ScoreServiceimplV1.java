package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;


/* Service 클래스 코드 순서
 * 1. 입력한 또는 자동 생성한 데이터를 담아둘 List 객체 선언 생성
 * 2. 데이터를 입력 생성하여 List에 저장하기
 * 
 * 
 */


		

public class ScoreServiceimplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList;// 객체선언
	
	public ScoreServiceimplV1() {
		
		scoreList = new ArrayList<ScoreVO>();
		 fileName= "src/com/callor/score/score.txt";
	
	}	
	
	
	@Override
	public void inputScore() {
		
		Scanner scan = new Scanner(System.in);

		
	}

	/* Random 클래스를 사용하여 점수 생성
	 * makerScore()에서만 사용할 거므로
	 * makerScore() method내에서 생성한다.
	 * 
	 */
	@Override
	public void makeScore() {
		
		// makeScore()는 호출될때마다 20개씩 데이터를 생성하여 추가한다
		// 이전에 저장된 데이터가 있더라도 계속 추가된다.
		
		
		/*
		 * list.remove(위치주소)
		 * list에 담긴 특정 위치의 항목을 삭제
		 * 
		 * list.removeAll(다른리스트)
		 * list에 담긴 데이터중 다른 리스트에 포함된 데이터를 모두 삭제하라
		 * 
		 * 
		 * 트릭을 사용한다.
		 * scoreList에 담긴 데이터 중에서 scoreList 자신의 데0이터와 일치하는 값을 모두 삭제하라
		 */
		scoreList.removeAll(scoreList); // 계속 20개씩 데이터가 생성되는데 이를 방지하기 위해 일종의 트릭 (20이상 데이터가 추가되지 않도록 방지) 
		
		Random rnd = new Random();
		
		for (int i = 0 ; i < 20 ; i ++) {
			
			ScoreVO scoreVO = new ScoreVO();
			
		
			
			/*
			 * i값에 따라서 00001 ~ 00020 까지 문자열을 생성한다
			 * strNum에 저장한다.
			 */
			String strNum = String.format("2021%03d", i + 1);//10진수 3자리를 만들고 001~0
			scoreVO.setStNme(strNum);
			
			
			scoreVO.setKor(rnd.nextInt(100) + 1);
			
			int intEng = rnd.nextInt(100) + 1;
			scoreVO.setEng(intEng);
			
			int intMeth = rnd.nextInt(100) + 1;
			scoreVO.setMeth(intMeth);
			
			int intMusic = rnd.nextInt(100) + 1;
			scoreVO.setEng(intMusic);
			
			int inthistory = rnd.nextInt(100) + 1;
			scoreVO.setHistory(inthistory);
			
			
			scoreList.add(scoreVO);		
			
		} //end for
		
		// 검사코드
		for(ScoreVO vo: scoreList) {
			//System.out.println(vo.toString());
			
		}
		
	}

	@Override
	public void savaScoreToFile() {
		
		//String fileName = "src/com/callor/score/score.txt";
		
		// 객체이름 명명
		// 클래스이름의 첫글자를 소문자로 하여 클래스이름을 모두 사용한다.
		FileWriter fileWriter = null;//fw
		PrintWriter printer = null; //pw
		
		try {
			
			fileWriter  = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			for(ScoreVO vo : scoreList) {
				printer.print(vo.getStNme() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMeth() + ":");
				printer.print(vo.getMusic() + ":");
				printer.print(vo.getHistory() + ":" + "\n");
				
				
			}
			
			printer.close();
			fileWriter.close();
			System.out.println("파일생성성공");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("파일생성 실퍠");
		}

		
	}

	/*
	 * 성적이 저장되어 있는 score.txt 파일을 읽어서 성적정보를 scoreList에 담기
	 * 
	 */
	public void loadScoreFromFile() {
		
		// 기존에 저장되어 있던 리스트를 모두 제거하자
		// scoreList = new ArrayList<ScoreVO();
		scoreList.removeAll(scoreList);
		
		FileReader fileReader = null;
		BufferedReader buffer = null;// 파일을 불러올때 문제가 생기기 때문에 버퍼리더를 사용해야 됨
		
		
			try {
				fileReader = new FileReader(fileName);
				buffer = new BufferedReader(fileReader);
			
				while(true) {
					
					try {
						String reader = buffer.readLine();
						if(reader ==null) {
							break;
						}
						String scores[] = reader.split(":");
						
						
						// 필드생성자를 호출하여
						// 인스턴스 변수에 저장할 값을 전달하면서
						// 동시에 객체를 초기화(생성)
						ScoreVO vo = new ScoreVO(scores[0],//stNum								
								Integer.valueOf(scores[1]),// Kor
								Integer.valueOf(scores[2]),// eng
								Integer.valueOf(scores[3]),// meth
								Integer.valueOf(scores[4]),// music
								Integer.valueOf(scores[5])// history
								);
						scoreList.add(vo);
								
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(fileName + "파일이 없습니다.");					
				}//buffer.close();
				
				
								

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		this.printScore();
		
	}

	private void totalAndAvg() {
		
		for(ScoreVO vo : scoreList) {
			
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMeth();
			sum += vo.getMusic();
			sum += vo.getHistory();
			float avg = (float) sum / 5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
			
		}
		
	}
	
	@Override
	public void printScore() {
		
		// 출력전 총점 평균 계산
		this.totalAndAvg();
		
		System.out.println(Values.dLine);
		System.out.println("빛나라 고교 성적처리 시스템 2021");
		System.out.println(Values.sLine);
		System.out.println("학번\t국어\t영어\t수학\t음악\t국사\t총점\t평균\t석차");
		System.out.println(Values.sLine);
		
		for(ScoreVO vo : scoreList) {
			
			System.out.print(vo.getStNme() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMeth() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg());
			
			System.out.print(vo.getRank() + "\n");
			
		}
		System.out.println(Values.sLine);		
	}

}
