package com.callor.shop.service;

import java.util.Scanner;

public class MenuService1 implements MenuServic {
	Scanner scan;
	CartServiceV1 csV1 = new CartServiceV1();

	//CartServiceV1 csV1 = new CartServiceV1();
	
	
	public  MenuService1 () {
		
		scan = new Scanner(System.in);
		
		
	}
	
	public Integer selectMenu() {
		
		System.out.println("=============================");
		System.out.println("빛나리 쇼핑몰 2021");
		System.out.println("-----------------------------");
		
		System.out.println("1. 장바구니에 담기");
		System.out.println("2. 장바구니 전체리스트 보기");
		System.out.println("3. 구매자별 장바구니 리스트 보기;");
		System.out.println("QUIT. 끝내기");
		
		System.out.println();
		System.out.print("원하는 메뉴를 선택하세요>> ");
		
		
		String strNum = scan.nextLine();
		if(strNum == "QUIT") {
		break;
		}
		
			try {
				int intNum = Integer.valueOf(strNum);				
				
				if(intNum == 1) {
					csV1.inputCart();
					
					
				} else if(intNum == 2) {
					
					csV1.printCart();
					
				} else if(intNum == 3) {
					
					csV1.userprintCart();
				}
			}
				 catch (Exception e) {
				// TODO: handle exception
			}
			
	}
		return null;
		
	}
}
	



	

