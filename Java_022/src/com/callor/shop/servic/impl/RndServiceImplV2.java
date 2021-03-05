package com.callor.shop.servic.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {
	
	// makeRnd()와 saveFileRand() method가 공용으로
	// 사용할 객체이므로 인슨턴스 객체 변수로 선언
	private List<Integer> intList;
	
	private String fileName;
	
	/*
	 * 매개변수가 없는 생성자와 파일이름을 매개변수로 전달받아야 하는 생성자를
	 * 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면 
	 * (= new RndServiceImplV2()라고 하면)
	 * 파일이름을 매개변수가 있는 생성자에게 전달하면서
	 * 매개변수가 있는 생성자를 호출한다.
	 */
	
	
	/*
	 * 매개변수가 있는 생성자는 객체를 생성할때 반드시 파일이름을 전달받아야만 한다.
	 * = new RndServiceImpV2(파일이름);
	 */
	
	public RndServiceImplV2(String fileName) {
		
		intList = new ArrayList<Integer>();
		this.fileName = "src/com/callor/shop/nums_rnd.txt";
 
	}

	

	public RndServiceImplV2() {
		this("src/com/callor/shop/nums_rnd.txt");
	}

	public void makeRnd() {
		
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			
			Integer num = rnd.nextInt(1000)+1;
			intList.add(num);
		}
		
	}
	
	
	/*
	 * 객체지향의 (메서드)다형성
	 * 
	 * 한 클래스 파일 내에서는 같은 이름의 method를 2번이상 정의 할 수 없다.
	 * 
	 * 하지만 객체지향 언어에서는 method의 매개변수가 있거나 없거나 또는
	 * 매개변수의 개수가 다르거나 매개변수의 type이 다르면
	 * 같은 이름의 method를 중복정의(중복하여 정의)할 슁ㅆ다.
	 * 
	 * 다형성, Overloading이라고 한다.
	 */
	public void saveFileRand() {		
		this.saveFileRand("src/com/callor/shop/nums_rnd.txt");

	}	
	
	/*
	 * RndServiceImplV1클래스를 처음 디자인 할 때는 파일의 이름을 코드에 직접 정장하였다.
	 * 이후 필요에 의해 파일의 이름을 method 매개변수로 받아서 사용할 수 있도록
	 * 변경했다.
	 * 
	 * 그랬더니 처음 V1클래스를 호출하여 만들었던 코드들에서 오류가 나타나 버렸다.
	 * 
	 * 이 오류를 객체지향의 다형성 원리를 이용하여 해결 하였다.
	 * 
	 * 만약 saveFilernd() 라고 method를 호출하면 코드에 포함된 파일이름을 적용하여
	 * saveFileFileRnd(파일이름) method를 호출하도록 만들었다
	 * 
	 * 이제는 saveFileRnd(), saeFileRnd(파일이름) 두가지중 어떤 것이든 호출하여
	 * 사용해도 문제가 없어졌다.
	 */
	
	
	// 저장할 파일 이름을 코드에 포함하지 않고
	// saveFileRnd() method 호출하는 곳에서 파일이름을 변경
	public void saveFileRand(String fileName) {
		
		 
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			int nCount = 0 ;
			for(Integer n : intList) {
				
				printer.print(n + ":");
				if (++ nCount %5 ==0) {
					printer.println();
				}
			}
			
			printer.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * saveFileRnd() method의 코드를 실행하여 Rnddom수들이 저장되어 있는 파일에서
	 * 
	 * Rndom 수들을 다시 읽어들여 연산을 수행하는 method
	 * 
	 * ex) 저장할대 사용한 파일이름 == 읽을때 사용할 파일 이름
	 * 
	 * 이 상황은 2개의  method가 1개의 공동된 파일 이름을 사용한다는 것이다.
	 * 
	 * 결귝 sevaFileRnd() method만 사용하기 위해서 선언된 fileName 변수는 
	 * 인스턴스 영역에 선언되어야 코드가 간편해 질 것이다.
	 */
	
	/*
	 * 
	 */
	public void loadFileRnd() {
		
	}
}
