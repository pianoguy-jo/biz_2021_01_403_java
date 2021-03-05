package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {
	
	/*
	 * main() Java의 진입점 method
	 * 프로젝트를 가상머신에 의해 최초로 실행할때 가상머신이 자동으로
	 * 호출하도록 만드는 method
	 * FileWriter_01.main("....") 형식으로 호출이 된다.
	 */
	public static void main(String args[]) {
		
		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 파일에 데이터를 저장하기 위해 2개의 클래스를
		// 객체로 선언
		// text 파일을 생성, 저장하기 위해서
		// FileWriter클래스와 PrintWriter 클래스를 사용한다.
		// 클래스를 사용한 객체 선언과 객체 생성부분을 분리해야 한다.
		// 왜냐하면 객체를 생성할 때, 사용할 try - catch가 의무 적용되어야 하기 때문에
		// 코드 작성 편의상 분리하는 것이 좋다.
		
		// 지금 바로 생성(초기화)를 하지 않을 경우 clear를 해준다
		// 숫자형일 경우는 0으로
		// 클래스일 경우 null 값으로
		// String str = "";
		// String str = null; 
		FileWriter fileWrite = null;
		PrintWriter printer = null;
		
		// fileWriter 객체 생성
		// jvm은 운영체제와 통신을 열결시도 합니다.
		// 이과정에서 아무리 코드를 견고하게(오류없이)만들어도
		// 어쩔수 없이 Exception이 발생하는 상황이 많다.
		// java 코딩에서는 이러한 경우 강제 의무적을 예외(상황)처리(try-catch처리)하도록 한다.
		
		
		try {
			fileWrite = new FileWriter(numsFile);
			
			// fileWrite를 PrintWriter 와 연결
			// fileWrite 만으로 파일을 저장할 수 있지만
			// 좀더 복잡한 과정을 실행해야 한다.
			// fileWrite를 직접 사용하여 파일 저장하는 방식을
			// 저수준(Low level)방식이라고 한다.
			// 하지만 저수준 방삭은 새로운 방식을 익혀야 할 경우도 있기 때문에 다소 부담스럽다.
			// fileWrite와 PrintWriter를 연결하면 평소에 많이 사용하던
			// System.out.print*() method와 비슷한 방식으로 코드를 작성할 수 있다.
			// 이러한 방식을 고수준(High level)방식이라고 한다.
			// 저수준보다 다소느리게 작동될수 있지만, 
			// 코드작성의 부담이 훨씬 줄어든다.
			// 또한 최근의 컴퓨터 성능이 워낙 좋아져서 큰차이가 나지 않는다.
			
			printer = new PrintWriter(fileWrite);// 콘솔 출력방식으로 파일에 저장함
			
			for(int i = 0 ; i < 1000; i++) {
				
				int num = rnd.nextInt(1000)+1;
				printer.println(num);
			}
			
			// FileWrite, PrintWriter 등을 사용하여 파일에 내용을 기록한 후에는
			// "반드시" 객체들을 close() 해 주어야 한다.
			// close) 를 수행하기 전까지는 기록된 데이터들을 운영체제가
			// 임시보관하고 있다.
			// 운영체제는 close() 명령이 수행되는 신호를 받으면 비로소
			// 데이터를 파일에 기록한다.
			
			printer.close();
			fileWrite.close();
			
			System.out.println("Mission Complete!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

}
