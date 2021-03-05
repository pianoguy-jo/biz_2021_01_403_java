package com.callor.shop.servic.impl;

import java.util.Random;

public class CartServiceImplV41{

	
	public Random rand;	
	private String cartFileName;
	
	
	
	public void CartServiceImplV41() {
		rand = new Random();
		int [] numsList= new int[100];
		cartFileName = "src/com/callor/shop/nums.txt";
		
		
		for(int i = 0; i < numsList.length; i++) {
			
			numsList[i] = rand.nextInt(100);		
			
		}
		 
		
	}
	}
		
	
