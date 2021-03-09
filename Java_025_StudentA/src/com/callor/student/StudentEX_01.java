package com.callor.student;

import com.callor.student.model.service.StudentService;
import com.callor.student.model.service.impl.StudentServiceImplV1;

public class StudentEX_01 {
	
	public static void main(String[] args) {
		
		StudentService ssV = new StudentServiceImplV1();
		
		ssV.loadStudentFromFile();
	}

}
