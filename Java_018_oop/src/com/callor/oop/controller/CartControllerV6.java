package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV2;

/*
 *  Controller 클래스 web appliction 프로젝트를 수행할 때
 *  처음 시작하는 시작점 클래스
 *  
 *  Service 등 모듈클래스를 객체로 선언하고
 *  모듈클래스의 method 들을 호출하는 일만 시행  
 *  
 */

public class CartControllerV6 {
	
	public static void main(String[] args) {
		
		CartServiceV2 csV2 = new CartServiceV2();
		
		csV2.inputCart();
		csV2.printCart();
	}

}
