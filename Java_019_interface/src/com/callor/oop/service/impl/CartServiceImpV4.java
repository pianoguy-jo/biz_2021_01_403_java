package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImpV4 implements CartService {

	
	private List<CartVO> cartList;
	private Scanner scan;

	// 생성자 method는 클래스와 이름이 같고
	// return type(void, int...) 이 없다.
	public CartServiceImpV4() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	public void inputCart() {

		
			System.out.println("=================");
			System.out.println("빛나리 카트 시스템 V3");
			System.out.println("--------------------");

			System.out.print("구매자(QUIT : 끝내기)>>");
			String strUssrName = scan.nextLine();
			
			//while () 반복문을 사용하여 ㅋ드를 작성할때는 사용자 반복문을 중단(종료)
			//할수 있는 탈출구를 만들어 주어야 한다
			if(strUssrName == "QUIT") {
				return;
			}

			System.out.print("상품명(QUIT : 끝내기)>>");
			String strProName = scan.nextLine();
			if(strProName == "QUIT") {
				return;
			}

			int intQty = 0;
			while (true) {
				System.out.print("수량>>");
				String strQty = scan.nextLine();

				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("수량은 1개 이상입력하세요");
					} else {
						break;
					}

				} catch (Exception e) {
					System.out.println("수량은 숫자로만 입력하세요");
				}
			}
			
			int intPrice = 0;
			while (true) {
				System.out.print("단가>>");
				String strPrice = scan.nextLine();

				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1) {
						System.out.println("단가는 1개 이상입력하세요");
					} else {
						break;
					}

				} catch (Exception e) {
					System.out.println("단가는 숫자로만 입력하세요");
				}

			
			// 카트에 저장
			
			CartVO cartVO = new CartVO();
			cartVO.setUserName(strUssrName);
			cartVO.setProductName(strProName);
			cartVO.setPrice(intPrice);
			cartVO.setPrice(intPrice);
			cartVO.setQty(intQty);
			cartVO.setTotal(intPrice * intQty);	
			
			cartList.add(cartVO);
		}
		
		
	}
	

	@Override
	public void printCart() {
		
		int nSize = cartList.size();
		
		System.out.println("============================");
		System.out.println("구매자\t상품명\t수량\t단가\t금액");
		for(int i = 0 ; i < nSize ; i++) {
			
			System.out.print(cartList.get(i).getUserName()+"\t");
			System.out.print(cartList.get(i).getProductName()+"\t");
			System.out.print(cartList.get(i).getQty()+"\t");
			System.out.print(cartList.get(i).getPrice()+"\t");
			System.out.print(cartList.get(i).getTotal()+"\t");
		}


	}

}

