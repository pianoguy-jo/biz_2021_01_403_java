package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImpV3;

public class CartEx_04 {

	public static void main(String[] args) {
		
		CartService cServic = new CartServiceImpV3();
		cServic.inputCart();
		cServic.printCart();

		//cServic.inputCart();
		//cServic.printCart();


	}

}
