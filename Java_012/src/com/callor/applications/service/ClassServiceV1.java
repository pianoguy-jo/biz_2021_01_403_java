package com.callor.applications.service;

public class ClassServiceV1 {
	
	
	/*
	 * Java 코딩을 할때 {} 내에서 같은 이름의 변수는 2번이상 불가
	 * class {} 내에서는 간은 이름의 메서드는 2번이상 선언 불가
	 * 
	 * 하지만, java에서는 메서드의 매개변수 개수, 타입이 다르면 같은 이름의 메서드를
	 * 중복하여 선언할 수 있다.
	 */
	public void sum(int num1, int num2) {

	}

	public void sum(int num, float num2) {

	}

	public void add(int num1, int num2) {

		int intSum = num1 + num2;
		System.out.println(intSum);
	}

	public void add(int intNum, float fNum) {

		float ifSum = intNum + fNum;
		System.out.println(ifSum);

	}

	public void add(double dNum, float fNum) {

		double dfSum = dNum + fNum;
		double dfMin = dNum - fNum;
		double dfMul = dNum * fNum;
		double dfDiv = dNum / fNum;

		// 덧셈
		System.out.print(dNum);
		System.out.print(" + ");
		System.out.print(fNum);
		System.out.print(" = ");
		System.out.println(dfSum);

		// 뺄셈
		System.out.print(dNum);
		System.out.print(" - ");
		System.out.print(fNum);
		System.out.print(" = ");
		System.out.println(dfMin);

		// 곱하기
		System.out.print(dNum);
		System.out.print(" X ");
		System.out.print(fNum);
		System.out.print(" = ");
		System.out.println(dfMul);

		// 나누기
		System.out.print(dNum);
		System.out.print(" / ");
		System.out.print(fNum);
		System.out.print(" = ");
		System.out.println(dfDiv);

	}
}
