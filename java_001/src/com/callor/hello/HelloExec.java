package com.callor.hello;

// 여기는 클래스 시작입니다.
// 슬래시를 연속 2번으로 시작하는 문장은
// 주석문이라고 한다.
public class HelloExec {
	
	/* 주석을 여러줄로 쓸 경우(/*)를 용한다.
	 * 여기는 주석문장(comment statement)
	 * 주석문은(comment)은 코드에 대한 설명
	 * 중요한 부분에 대한 설명 등을 작성하는 곳
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "" 내에 있는 글자, 단어등을 문자열이라고 한다.
		// 문자열 리터럴
		// String 리터럴
		System.out.println("반갑습니다.");
		
		// 우리나라만세 문자열을 console에 출력하라.
		System.out.println("우리나라만세");
		// 숫자 30과 40를 덧셈하여 Console에 출력하라
		// 연산부호(+,-, *, /)와 숫자사이에는 빈칸의 갯수가 아무런 문제가 없다.
		// 하지만 가독성을 위하여 빈칸을 한칸씩 놓어주자.
		System.out.println(30+40);
		System.out.println(30 + 40);
		System.out.println(30+  40);
		System.out.println(30 +40);
		
		// 30 + 40이라는 문자열을 Console에 출력하라.
		System.out.println("30 + 40");
		
		// 숫자 30을 문자열 30으로 바꾸고
		// 숫자 40을 문자열 40으로 바꾸고
		// 두 문자열을 연결하여 Console에 출력하라.
		System.out.println( "30" + "40" );
		
		System.out.println("우리나라 + 대한민국");
		System.out.println("우리나라" + "대한민국");
		
		System.out.println(30 * 40);
		//System.out.Println("30" * "40");
		
		
		/*
		 * 연산
		 * 숫자, 숫자는 4칙연산을 모두 수행할 수  있다.
		 * 숫자, 수자의 4칙연산은 수학의 연산규칙과  같다.
		 * 문자열, 문자열의 연산은 연결(+) 연산만 가능
		 * 문자열과 문자열을 연결하여 한 문자열로 만들수 있다.
		 */
		
		//문자열과 숫자를 덧셈연산하면 숫자가 자동으로 문자열화(변환)된다.
		System.out.println("30" + 30);
		System.out.println("30 + 40 = " + 30 + 40 );
		System.out.println("30 + 40 = " + (30 +40));
		System.out.println("30 X 40 = " + 30 * 40);
		
	}

}
