package com.callor.oop.model;

/*
 * Value Object의 인스턴스 변수 은닉
 * 인슨턴스 변수는 public으로 선언하지 않고
 * 보통 private로 선언한다.
 * VO클래스를 사용하여 선언된 VO객체는 인슨턴스 변수에 직접 접근할 수 없다.
 * 
 * ScoreVO sVO = new ScoreVO();
 * 
 * sVO.strName = "홍길동"; // 이런코드는 사용불가
 * String name = sVO.strName; // 이 코드도 사용불가
 * 
 * private으로 서언된 인스턴스에 접근하기 위한
 * setter, getter method 들을 통해서 접근해야 한다.
 * 저장할 때는 : sVO.setStrName("홍길동);
 * 읽을때는 : name = sVO.getStrName();
 */

public class ScoreVO {

	public String strName;
	private int intKor = -1;
	private int intEng = -1;
	public int intMath;

	public int intSum;
	public float floatAVg;
	
	/*
	 * 국어점수(intKor)를 저장할 인스턴스 변수를 
	 * private로 선언하여 직접 접근할 수 없도록 만든다
	 * 
	 * 국어점수(intKor) 인스턴스변수에 간접적으로 값을 저장하는 
	 * setIntKor()method를 선언
	 * setIntKor() method는 점수를 문자열로 받아서 정수로 변경한 다음
	 * 유효성 통과(정상적인 점수일 경우)를 한 경우만 국어 인스턴스변수(this.intKor)에 저장한다.
	 * 
	 * 만약 점수가 잘못되어 요효성검사를 통과하지 못하면 국어점수 -1로 세팅되어 있을  것이다. 
	 */

	public void setIntKor(String strKor) {

		try {
			int intKor = Integer.valueOf(strKor);
			if (intKor >= 50 && intKor <= 100) {
				this.setIntKor(strKor);
			}

		} catch (Exception e) {

		}
	}
	
	public int getIntKor() {		
		return this.intKor;
	}
	
	/*
	 * VO 클래스를 설계하면서 intEng 인스턴스 변수를 private 으로 설정하여
	 * 변수에 직접 접근하지 못하도록 하고
	 * 
	 * 변수에 값을 저장할 때는 setIntEng() method를 통해서 값을 
	 * 저장하도록 설정한다.
	 * 
	 * 이때 setInt뚷() MEthod는 점수를 매개변수로 전달받아서 요효성검사를
	 * 수행하고 검사가 통과되었을 때만 intEng 변수에 저장(setting)할수 있도록 만드는 것
	 * 
	 */
	public void setIntEng(String intEng) { //private로 했을 경우값을 저장하는 부분
		try {
			int intEng = Integer.valueOf(strEng);
			if (intEng > 50
		}
	}
	
	
	/*
	 * 변수에 값을 저장하기 전에 유효성검사를 하기 위해서
	 * setIntEng()method 를 통하도록 코드를 변경했다.
	 * 
	 * 변수는 private으로 setINtEng()mathod tjsdjs 
	 * 
	 * intEng 변수의 값을 읽지도 못하는 상황이 발생한다.
	 * intEng 변수의 값을 저장한 후 읽을 수 있어야 되는데
	 * intEng 변수의 값을 읽기위해서 getIntEng() 라는 메세지를 또하나 선언해 둔다
	 */
	public int getIntEng() {////private로 했을 경우 값을 읽어드리는 부분
		return this.intEng;
	}

}
