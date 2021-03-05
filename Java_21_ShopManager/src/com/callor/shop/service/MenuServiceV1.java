package com.callor.shop.service;

import java.util.Scanner;

public class MenuServiceV1 implements MenuServic {

	private CartServiceV1 csV1 = new CartServiceV1();
	private Scanner scan;

	public MenuServiceV1() {

		scan = new Scanner(System.in);

	}



public Integer selectMenu() { 

int intNum = 0; 
while(true) { 

System.out.println("==========================");
System.out.println("빛나라 쇼핑몰 2021"); 
System.out.println("--------------------------");

System.out.println("1. 장바구니 상품 담기");
System.out.println("2. 장바구니 전체 리스트 보기");
System.out.println("3. 구매자별 장바구니 리스트 보기");
System.out.println("QUT. 끝내기"); 

System.out.println("원하는 메뉴를 누르시요");
System.out.print(">>");  

String strNum = scan.nextLine();
if(strNum.equals("QUT")) {  

break;
}  

try {
intNum = Integer.valueOf(strNum); 

if(intNum == 1) {  

csV1.inputCart();  

} else if (intNum == 2) { 

csV1.cartPrint(); 

} else if (intNum == 3) { 

csV1.userPrint(); 

} else { 
	
}
System.out.println(" 잘 못 입력했습니다.");
System.out.println(" 1 ~ 3 까지 QUT(끝내기)를 입려해 주시기 바랍니다."); 

} 

} catch (Exception e) {
System.out.println(" 1 ~ 3 까지 QUT 또는 (끝내기)를 입려해 주시기 바랍니다."); 

}  

}

	return null;

}}
