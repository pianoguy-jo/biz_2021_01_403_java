package com.callor.applications;

import com.callor.applications.service.ClassServiceV5;

public class Class_07 {

	public static void main(String[] args) {

		ClassServiceV5 csV5 = new ClassServiceV5();

		float result = csV5.sum(55.2f, 33.7f);

		int num1 = 1234567890;
		long num2 = 1234567890;

		float num3 = 3.0F;
		num3 = (float) 3.0;

		double num4 = 3.0;

		System.out.println(result);
	}

}
