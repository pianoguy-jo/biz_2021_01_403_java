package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.medel.CartVO;

public class CartList {
	
	public static void main(String[] args) {
		
		// CartVO를 여러개 list로 담을 객체 생성
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCatrPName("초코파이");	
		cartVO.setCartPrice(1000);
		cartVO.setQty(10);
		
		//카트리스트 추가
		cartList.add(cartVO);
		
		// 또 하나의 상품 준비
		cartVO = new CartVO();
		cartVO.setCatrPName("홍길동");
		cartVO.setCatrPName("칠성사이다");
		cartVO.setCartPrice(2500);
		cartVO.setQty(1);
		
		// 준비된 상품 카트리트스에 추가
		cartList.add(cartVO);
		
		// == 카트에 2개 상품을 저장
		// 카트 리스트를 출력
		System.out.println("=======================");
		System.out.println("장바구니");
		System.out.println("-----------------------");
		
		cartVO = cartList.get(0);
		System.out.printf("%s\t%S\t%d\t%d\n",
				cartVO.getCatrPName(),
				cartVO.getCatrPName(),
				cartVO.getCartPrice(),
				cartVO.getQty());
		
		cartVO = cartList.get(1);
		System.out.printf("%s\t%S\t%d\t%d\n",
				cartVO.getCatrPName(),
				cartVO.getCatrPName(),
				cartVO.getCartPrice(),
				cartVO.getQty());
		
		for(int i = 0 ; i < 2 ; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%S\t%d\t%d\n",
					cartVO.getCatrPName(),
					cartVO.getCatrPName(),
					cartVO.getCartPrice(),
					cartVO.getQty());
			
		}
		
		
		
				

}
}


