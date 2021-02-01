package com.callo.hello;

/*
 *   1. java의 코드 파일을 생성하고(Hello.java)
 * 2. javac를 사용하여 컴파일을 실행하여
 * Hello.class 를 만드는 과정에서javac 가 아무런 의미 없는 문장으로 인식하고
 * 그냥 지나치는 부분
 * 
 *  java class
 *   - java 언어 문법에 맞도록 작성된 문서 파일
 *   - public class 키워드로 시작을 하고
 *   - 임으로 이름을 작성하여 만든다 
 *       여기서는 ) Hello
 *   - Hello.java라는 파일에 코드가 저장된다.
 *   - 클래스 이름과 파일이름은 항상 같아야 한다.
 *   - 클래스가  HelloKorea이면
 *       파일이름은 Hellokorea.java로 작성을 한다
 *   - 클래스 이름은 첫글자가 반드시 영문대문자
 *   - 영문대소문자, 숫자,  _(Under Bar, Under Score)
 *   
 *	 - 두개 이상의 단어를 조합할때는 Camel Case 로 한다 
 */
public class HelloKorea 
{
	/*
	 * main() mathod  라고 부른다
	 * 프로젝트 클래스를 만들고 컴파일을 수행한 후 실행을 했을때 반드시 있어야할 명령문 
	 */
	
	// 명령문의 시작부분에 //를 붙이면 명령문이 없는 것과 같다.
	public static void main(String args[])	{
	
		// console출력 명령문
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println("30 * 40 = " + 30 * 40);
		System.out.println("40 - 30 = " + (40 - 30));
		System.out.println("40 / 20 = " + 40 / 20);
		System.out.println("반갑습니다.");
		System.out.println(30);
		/*
		 * Console 출력문
		 * ""(문자열 인용문, Double Oute. Mark)
		 *    -  "" 표시 내의 내용을 그대로 Console출력
		 *    ""로 묶인 내용을  '문자열, String' 이라고 한다.
		 * 숫자(정수, 실수 등등)는 숫자 그대로 수학적으로 해석한다.
		 * 
		 * 산술(연산)식
		 * 1. 숫자 산출식
		 *  - 수학의 4칙 연산을 수행하고 결과를 출력
		 *  
		 * 2. 문자열 산술식		 * 
		 *  -  "" 로 묶인 문자열을 + 연산하면 문자열을 연결하여 출력
		 *  - 문자열 산술식은 + 연산만 가능
		 *  
		 * 3. 문자열 + 숫자 산술식
		 *  - 모든 숫자를 자동으로 문자열화하여 문자열 산술식으로 바꾸어 연산하고
		 *    결과를 출력한다.
		 */
	}
}
