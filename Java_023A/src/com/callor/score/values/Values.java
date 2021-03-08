package com.callor.score.values;

public class Values {
	
	public static final String dLine;
	public static final String sLine;
	
	
	// static final 변수 생성하기
	static {
		
		// ================================== 만들기
		dLine = String.format("%065d", 0) // 0이라는 문자열을 50개 만들고
				.replace("0", "=");// "0"을 "=" 바꾸어라
		
		sLine = String.format("%065d", 0)
				.replace("0", "-");
				
		
	}

}
