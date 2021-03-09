package com.callor.student;

import com.callor.student.service.impl.StudentServiceImplV1;

public class StudentEX {
	
	public static void main(String[] args) {
		
		StudentServiceImplV1 ssV1 = new StudentServiceImplV1();
		
		ssV1.lodeDataFromfile();
		ssV1.dataSearch();
	}

}
