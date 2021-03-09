package com.callor.student;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;

public class Ex_09 { // 오류수정
	
	public static void main(String[] args) {
		
		List<StudentVO> stdList = null;
		
		stdList = new ArrayList<StudentVO>();
		
		StudentVO stdVO = new StudentVO();
		
		
		for(int i = 0 ; i < 10 ; i++) {
			

			// StudentVO stdVO = null;
			stdVO.setStName("홍길동");
			stdVO.setStNum("0001");
			stdList.add(stdVO);
			
		}
		
	}
	

}
