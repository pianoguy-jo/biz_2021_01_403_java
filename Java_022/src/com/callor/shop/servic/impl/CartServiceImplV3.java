package com.callor.shop.servic.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.servic.CartServiceV2;

public class CartServiceImplV3 extends CartServiceImplV1 implements CartServiceV2{

	
	private Scanner scan;
	private List<CartVO> cartList;
	private String cartFileName;
	
	@Override
	public void inputCart() {
		
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
		cartFileName = "src/com/callor/shopcartlist.txt";

		super.inputCart();
	}
	
	@Override
	public void seveCartToFile() {
		
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			
			fileWriter = new FileWriter(cartFileName);
			printer = new PrintWriter(fileWriter);
			
			printer.println("대한민국");
			printer.println("우리나라");
			printer.println("Republic of Korea");
			
			printer.close();			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		
		
		
	
		
	}

	@Override
	public void loadCartFromFile() {
		// TODO Auto-generated method stub
		
	}

}
