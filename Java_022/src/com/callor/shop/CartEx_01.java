package com.callor.shop;

import com.callor.shop.servic.CartService;
import com.callor.shop.servic.impl.CartServiceImplV1;
import com.callor.shop.servic.impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEx_01 {
	
	public static void main(String[] args) {
		
		
		// 클래스로 선언, 클래스로 생성 
		MenuServiceImplV1 ms = new MenuServiceImplV1();
		
		// 인터페이스로 선언, 클래스로 생성
		// 인터페이스를 iplements 하여 작성된 클래스는
		// 인터페이스로 선언하자
		// 코드 업그래이드가 조금 쉬어 진다.(유지보수)
		MenuService mService = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV1();
		//
		
		while(true) {
		Integer menuItem = mService.selectMenu();
		if(menuItem == null) {// 널값 : 아무것도 아닌 값
			break;
		} else if(menuItem == Values.Menu_INPUT) {
			
			cService.inputCart();
			//System.out.println("장바구니 추가");
			
		}  else if(menuItem == Values.Menu_ALL_LIST) {
			
			cService.printAllCart();
			//System.out.println("장바구니 리스트 보기");
			
		}  else if(menuItem == Values.Menu_USER_LIST) {
			
			// System.out.println("구매자별 리스트 보기");
			cService.printUserCart();
		}
			
		}
		
		System.out.println("업무종료!! 야 퇴근이다!!");
		
		}
	
			
			

}
