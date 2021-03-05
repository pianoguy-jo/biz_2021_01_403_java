package com.callor.shop.servic.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV11 {
	
	// makeRnd()와 saveFileRand() method가 공용으로
	// 사용할 객체이므로 인슨턴스 객체 변수로 선언
	private List<Integer> intList;
	
	public RndServiceImplV11() {
		
		intList = new ArrayList<Integer>();
 
	}
	
	
	
	public void makeRnd() {
		
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			
			Integer num = rnd.nextInt(100)+1;
			intList.add(num);
		}
		
	}
	
	
	public void saveFileRand() {
		
		String fileName = "src/com/callor/shop/files/score.txt"; 
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
}
