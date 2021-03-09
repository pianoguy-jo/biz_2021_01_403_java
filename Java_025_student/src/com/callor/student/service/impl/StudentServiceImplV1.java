package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.StudentVO;
import com.callor.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	
	
	public Scanner scan;
	List<StudentVO> studentList;
	
	
	
	public StudentServiceImplV1() {
		
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
		
		
	
	}


	


	public void lodeDataFromfile() {
		
		String studentFile = "/src/com/callor/student/학생정보리스트.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
			buffer.readLine();
			
			String reader = buffer.readLine();
			
			if(reader == null) {
				
				break;
				
			}
			
			String[] date = reader.split(":");
			
			StudentVO studentVO;
			studentVO = new StudentVO(
					
					date[0], //학번
					date[1], //이름
					date[2], //학과
					Integer.valueOf(date[3]), //학년
					Integer.valueOf(date[4]), //반
					date[5], //주소
					date[6]  //전화번호
							);
			
			studentList.add(studentVO);
			fileReader.close();
			buffer.close();
			
			}
					
				
			} catch (IOException e) {			

				
			}
			
	}
			
		 
	

	@Override
	public void dataSearch() {
		
		StudentVO studentVO = new StudentVO();
		
		System.out.print("이름 >> ");
		String name = scan.nextLine();		
			
			if(studentVO.getsName().equals(name)) {
				
				System.out.println("이름: " + studentVO.getsName());
				System.out.println("학과: " + studentVO.getDeap());
				System.out.println("학년: " + studentVO.getGrade() + "학년");
				System.out.println("반: " + studentVO.getClaNum() + "반");
				System.out.println("주소: " + studentVO.getAddr());
				System.out.println("전화번호: " + studentVO.getTelNum());
			} else {
				
				System.out.println("찾으신 학생이 없습니다..");
				return;
			}
		
			
		} 
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	

	@Override
	public void infoPrint() {
		// TODO Auto-generated method stub
		
	}

}
