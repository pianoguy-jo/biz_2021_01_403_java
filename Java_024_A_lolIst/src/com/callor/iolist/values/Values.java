package com.callor.iolist.values;

public class Values {

	// 정수를 매개변수로 받아서 문자열 return하는 method
	public static String dLine(int count) { // count 매개 변수로 받아서 System.out.println(Values.dLine(50)) <--- 50 입력하여 라인 "=" 그릴수 있음

		// count가 50이라면 %050d 의 문자열이 만들여 진다
		String dLineFormat = "%0" + count + "d";
		String dLine = String.format(dLineFormat, 0)
				.replace("0", "=");// "0"을 "=" 바꿈
		
		return dLine;

	}

	public static String sLine(int count) {

		// count가 50이라면 %050d 의 문자열이 만들여 진다
		String sLineFormat = "%0" + count + "d";
		String sLine = String.format(sLineFormat, 0)
				.replace("0", "-");
		
		return sLine;

	}

}
