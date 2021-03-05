package com.callor.shop;

import com.callor.shop.servic.CartService;
import com.callor.shop.servic.impl.CartServiceImplV2;
import com.callor.shop.servic.impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEx_02 {
	
	public static void main(String[] args) {
		

		MenuService mService = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV2();
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
