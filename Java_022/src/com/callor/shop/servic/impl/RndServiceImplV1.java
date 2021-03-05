package com.callor.shop.servic.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {
	
	private Random rnd;
	private List<Integer> numsList;
	String newFile = "src/com/callor/shop/nums.txt";
	
	
	public RndServiceImplV1() {
		
		rnd = new Random();
		numsList = new ArrayList<Integer>();
	}

	
	
	public void RndServiceImplV1() {
		
		int[] nums = new int[100];
		
		for(int i = 0; i < 100; i++) {			
			
			numsList.add(rnd.nextInt(1000)+1);
			
		}
		
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter(newFile);
			printWriter = new PrintWriter(fileWriter);
			
			//int nSzie = numsList.size();
			for(Integer n : nums) {
				printWriter.print(n);			

			}
			
			int nSize = numsList.size();
			for(int i = 0 ; i < nSize; i++ ) {
				
				Integer n = numsList.get(i);
				printWriter.println(n + "\t");
			}
			
			printWriter.close();
			fileWriter.close();
			
			//printer.close();
			//fileWrite.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	/*
	 * Random rnd = new Random(); List<Integer> numsList = new ArrayList<Integer>();
	 * String newFile = "src/com/callor/shop/nums.txt"; Integer [] nums = null;
	 * 
	 * 
	 * for(int i = 0; i < 100 ; i++) {
	 * 
	 * nums[i] = rnd.nextInt(1000) + 1; numsList.add(nums[i]); }
	 */
			
			
			
			
			
			/*int[] nums = new int[100];
	Random rnd;
	String newFile ="src/com/callor/shop/nums.txt";	
	List<Integer> numsList;
	
	
	
		
		 numsList = new ArrayList<Integer>();
		 rnd = new Random();

	

	
	
	for(int i = 0; i < 100 ; i++) {
		
		nums[i] = rnd.nextInt(1000) + 1;
		numsList.add(nums[i]);
	}
	
	FileWriter fileWriter = null;// = new FileWriter(newFile); 
	PrintWriter printWriter = null;// = new PrintWriter(fileWriter);
	
	fileWriter = new FileWriter(newFile);
	
	int nSize = numsList.size();
	*/

		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * for(int i = 0 ; i < 100 ; i++) 
	 * { int num1 = i + 1; // ESCAPE 문자 // 역슬래시(\)로
	 * 시작되는 영문자 // 키보드를 눌러서 표현하지 못하는 // 특별한 기호, 신호, 문자 등을 // 표현하는 방법 // "\t" : TAB
	 * Key // 1 2 3 4 5 // 6 7 8 9 10 // 11 12 13 14 15 
	 * 
	 * System.out.print(num1
	 * +"\t"); if(num1 % 5 == 0) { System.out.println(); }
	 */
	
	
	
	
	

}
