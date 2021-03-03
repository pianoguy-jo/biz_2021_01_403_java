package com.callos.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.CartServiceV1;
import com.callor.shop.service.MenuService1;

public class CartEX {
	
	
	public static void main(String[] args) {
		
		CartService csV1 = new CartServiceV1();
		MenuService1 msV1 = new MenuService1();
		
		msV1.selectMenu();		
		csV1.userprintCart();
		csV1.printCart();
		 
		
		
	}

}
