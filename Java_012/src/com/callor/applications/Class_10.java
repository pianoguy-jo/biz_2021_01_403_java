package com.callor.applications;

import com.callor.applications.service.ClassServiceV7;

public class Class_10 {
	
	public static void main(String args[]) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		for (int i = 0 ; i < 9 ; i++) {
			int num = i + 2;
			csV7.gugudan(num);		
		}
	}

}
