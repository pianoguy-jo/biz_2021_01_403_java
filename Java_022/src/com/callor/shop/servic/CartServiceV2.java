package com.callor.shop.servic;

public interface CartServiceV2 extends CartService{
	
	public void seveCartToFile();
	public void loadCartFromFile();

}
