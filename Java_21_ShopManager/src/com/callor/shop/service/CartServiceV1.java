package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartServiceV1 implements CartService {
	
	private List<CartVO1> cartList;	
	private Scanner scan;
	
	public CartServiceV1() {
		
		cartList = new ArrayList<CartVO1>();
		scan = new Scanner(System.in);
		
	}
	
	
	
	
	public void inputCart() {				
		
		System.out.println("=============================");
		System.out.println("장바구니 담기");
		System.out.println("-----------------------------");		
		
		// 손님이름 입력
		System.out.print("손님 이름>> ");
		String uName = scan.nextLine();
		
		
		// 상품이름 입력
		System.out.print("상품 이름>> ");
		String pName = scan.nextLine();
		
		// 단가입력	
		int pric = 0;
		System.out.println("단가를 0이상 입력하여 주시기 바랍니다.");
		System.out.print("단가>> ");
		try {
			String strPrice = scan.nextLine();
			pric = Integer.valueOf(strPrice);
			
		} catch (Exception e) {
			System.out.println("입력을 잘못했습니다.");
			
		}
		
		// 수량입력
		int qty = 0;
		System.out.println("수량를 0이상 입력하여 주시기 바랍니다.");
		System.out.print("수량>> ");
		try {			
			String strQty = scan.nextLine();
			qty = Integer.valueOf(strQty);
			
			
		} catch (Exception e) {
			System.out.println("입력을 잘못했습니다.");
			
		}
		CartVO1 cartVO1 = new CartVO1();
		cartVO1.setUserName(uName);
		cartVO1.setProducName(pName);
		cartVO1.setPrice(pric);
		cartVO1.setQty(qty);
		cartVO1.setTotal(pric * qty);
		
		cartList.add(cartVO1);
	}
	
	
	// 손님장바구니 리스트
	public void userprintCart() {
		int size = cartList.size();
		System.out.println("구매자 이름을 입력하세요");
		System.out.println("구매자 이름>> ");
		String userName = scan.nextLine();
		
		if(userName == cartList.toString()) {			
			System.out.printf("%s\t%s\t%d\t%d\n",CartVO1.class);
			
		}
		
		
		
	}
	// 전체 장바구니 리스트
	public void printCart() {
		
		System.out.println("====================================");
		System.out.println("전체장바구니 리스트");
		System.out.println("------------------------------------");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		
		int size = cartList.size();
		
		for(int i = 0 ; i< size; i++) {
		System.out.print(cartList.get(i).getUserName() + "\t");
		System.out.print(cartList.get(i).getPrice() + "\t");
        System.out.println(cartList.get(i).getQty() + "\t");
		System.out.println(cartList.get(i).getTotal() + "\t");
		}
		
	}

}

