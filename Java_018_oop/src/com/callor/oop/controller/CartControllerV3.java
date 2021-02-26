package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.medel.CartVO;

public class CartControllerV3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<CartVO> cartList = new ArrayList<CartVO> ();
		
		for(int i = 0 ; i < 3 ; i++) {
			
			System.out.println("======================");
			System.out.println();
			System.out.println();
			
			System.out.print("구매자>>");
			String strUserName = scan.nextLine();
			
			System.out.print("상품평>>");
			String strPName = scan.nextLine();
			
			System.out.print("단가>>");
			String intPrice = scan.nextLine();
											
			
			
			System.out.print("수량>>");
			String intQty= scan.nextLine();

			
			// 카트정보 생성하기
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCatrPName(strPName);
			cartVO.setQty(Integer.valueOf(intPrice));
			cartVO.setQty(Integer.valueOf(intQty));
			
			// 카트정보 리스트에 추가하기
			cartList.add(cartVO);
		} // end for
		
		
		System.out.println("==============================");
		System.out.println("구매자상품평단가수량");
		System.out.println("------------------------------");
		
		// 배열에서 배열.length 값을 참조하면 배열의 개수 알수 있었다.
		// List에서는 list.size() method를 호출하면 list 개수를 return 해준다.
		
		int nSize = cartList.size(); // 먼저 리스트 갯수를 센 다음에 반복문을 사용하면 더 효율적이다.
		for(int i = 0 ; i < cartList.size() ; i++) {
			
			System.out.printf("%s\t%S\t%d\t%d\n",);
		
		}
		System.out.println("==============================");
			
				
			
			
		}
		
		
	}


