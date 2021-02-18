package com.callor.applications;

import com.callor.applications.service.ClassServiceV1;

public class Class_01 {
	
	public static void main(String[] args) {
		
		/*
		 * == 변수 선언문, 생성(초기화)==
		 * 1. 정수형 변수 num1을 선언하고 정수형 30을 할당하라.
		 * 2. 앞으로 num1이라는 변수를 사용하여 정수값을 저장하고,
		 *    여러가지 기능을 수행할 터이니 변수를 준비해 달라
		 */
		
		 int num1 = 0;
		 num1 = 40;
		
		 /*
		  * (프로젝트에) 선언되어 있는 ClassServiceV1의 method 들을 사용하여
		  * 코드를 실행하려고 하니 사용할 준비를 해달라
		  * 
		  * scV1 : "객체(Object)" 라고 한다.
		  * = new Css..() : 객체를 사용할수 있도록 초기화하기
		  * 
		  * csV1 = new Css..() : 객체를 초기화 하고 사용할 준비를 하는 상태
		  * 					 이 명령이 수행된 이후에는 csV1을 인스턴스(instance)라고 한다.
		  */
		ClassServiceV1 scV1 = new ClassServiceV1();
		ClassServiceV1 scV1_1; // 사용할 준비가 안된 상태 꼭 "= new ClassServiceV1()" 넣어야 한다
		
		scV1.add(3, 4);
		scV1.add(3, 3F);
		scV1.add(3, (float)3);
		
		scV1.add(3D, 4F);
		scV1.add(3, 4);
		
		
	}

}
