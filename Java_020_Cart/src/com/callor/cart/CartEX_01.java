package com.callor.cart;

import com.callor.cart.servic.CartService;
import com.callor.cart.servic.MenuService;
import com.callor.cart.servic.impl.CartServiceV1;
import com.callor.cart.servic.impl.MenuServiceV1;

public class CartEX_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV1();
		CartService cService = new CartServiceV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			if(menu == null) {
				break;
			}else if (menu ==1) {
				
				cService.inputCart();				
			}else if (menu ==3) {
				cService.inputCart();
				
			}
		}
		
	}

}
