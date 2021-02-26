package com.callor.oop.medel.controller;

import com.callor.oop.medel.CartVO;

public class CartControllerV2 {
	
	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCatrPName("초코파이");
		cartVO[0].setCartPrice(500);
		cartVO[0].setQty(20);
		
		System.out.println(cartVO[2].toString());
		
		// == cartVO의 개수가 3인 상태
		// 상품 한가지를 더 카트에 넣고 싶다
		
		cartVO = new CartVO[4];
		
		cartVO[3] =  new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCatrPName("바나나우유");
		
		System.out.println("=================================");
		System.out.println("카느내용");
		System.out.println("---------------------------------");
		for(int i = 0 ; i < cartVO.length ; i++) {
			System.out.println(cartVO[i].toString());
			
			cartVO[i].getCatrPName();
		}
				
		
				
		
		
		
		
		
		 
				
	
		
	}

}

