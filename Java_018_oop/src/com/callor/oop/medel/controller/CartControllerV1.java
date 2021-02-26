package com.callor.oop.medel.controller;

import com.callor.oop.medel.CartVO;

/*
 * Controller 클래스
 * java project 에서 Controller 접미사가 붙어있는 클래스는
 * 보통 프로젝트의 시작 부분으로 사용된다.
 */
public class CartControllerV1 {
	
	public static void main(String[] args) {

		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");//getCartUserName("홍길동");
		cartVO.setCartDate("2021-02-26");
		cartVO.setCatrPName("초코파이");
		cartVO.setQty(10);
		cartVO.setCartStd("바나나맛");
		cartVO.setCartPrice(1000);
		cartVO.setCartTotal(1000 * 10);
		
		System.out.println(cartVO.toString());
		
	}

}
