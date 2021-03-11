package com.callor.cart.servic.impl;

import java.util.Scanner;

import com.callor.cart.servic.MenuService;

public class MenuServiceV1 implements MenuService{
	
	private Scanner scan;
	
	public MenuServiceV1() {
		
		scan = new Scanner(System.in);
		
		
		
	}
	
	public Integer selectMenu() {
		// TODO Auto-generated constructor stub
		while(true) {
			System.out.println("============================");
			System.out.println("카트메뉴");
			System.out.println("---------------------");
			System.out.println("1. 카트메뉴");
			System.out.println("2. 카트삭젠");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 종료");
			System.out.println("---------------------");
			String strMenu = scan.nextLine();
			if(strMenu=="Q") {
				
				try {
					Integer intMenu = Integer.valueOf(strMenu);
					if(intMenu >= 1 && intMenu <= 3) {
						return intMenu;
					} else {
						System.out.println("메뉴는 1~3 까지 선택");
					}
					
				} catch (Exception e) {
					
					System.out.println("메뉴 선택은 Q, 1 ~ 3까지 정수만 가능");
					// TODO: handle exception
				}
			}
			
			return null;
			
		}
		
	}
	

}
