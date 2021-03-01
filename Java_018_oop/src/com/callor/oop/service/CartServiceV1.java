package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.CartList;
import com.callor.oop.medel.CartVO;


public class CartServiceV1 {

	Scanner scan = new Scanner(System.in);
	
	List<CartVO> cartList = new ArrayList<CartVO>();	
	
	public void inputCart(String strUsrtName, String strPName, String strQty, String strPrice) {

		System.out.println("====================");
		System.out.println("쇼핑카트 상품추가");
		System.out.println("--------------------");

		// 입력받기
		System.out.print("구매자>> ");
		strUsrtName = scan.nextLine();

		System.out.print("상품명>> ");
		strPName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.print("수량>> ");
			strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 2) {
					System.out.println("수량은 2이상");
					continue;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로 입력하세요");
			}
			break;
		}

		int intPrice = 0;
		while (true) {
			System.out.print("단가>> ");
			strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("단가는 1,000원 이상");
					continue;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로 입력하세요");
			}
			break;
		}
		
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName(strUsrtName);
		cartVO.setCatrPName(strPName);
		cartVO.setCartPrice(intPrice);
		cartVO.setQty(intQty);
		
		cartList.add(cartVO);

	}

	public void printCartList() {
		
		System.out.println("===============================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("-------------------------------");
		
		int nSize = cartList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCatrPName(),
					cartList.get(i).getCartPrice(),
					cartList.get(i).getQty()
					);
		}
		System.out.println("==============================");
		

	}

}
