package com.callor.student;

import com.callor.student.model.StudentVO;

public class EX_04 {
	
	public static void main(String args[]) {
		
		// 배열 10개를 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		int index = 2;
		
		// 1 초기화 방법
		stdArray[index] = new StudentVO();
		
		// 2 초기화 방법
		for(int i = 0 ; i < stdArray.length; i++) {
			
			stdArray[i] = new StudentVO();
			
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("이름 : " + stdArray[index].getStNum());
		
		
	}

}


