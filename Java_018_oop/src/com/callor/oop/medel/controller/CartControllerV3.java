package com.callor.oop.medel.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.medel.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CartVO cartVO = new CartVO();

		List<CartVO> cartList = new ArrayList<CartVO>();

		for (int i = 0; i < 3; i++) {
			
			cartVO = new CartVO();
			
			System.out.print("구매자>>");
			cartVO.setCartUserName(scan.nextLine());

			System.out.print("상품명>>");
			cartVO.setCatrPName(scan.nextLine());

			System.out.print("수량>>");
			String str = scan.nextLine();
			cartVO.setQty(Integer.valueOf(str));

			System.out.print("가격>> ");
			str = scan.nextLine(); // for()반복문에서 Scanner는 항상 문자열로 입력받아 Integer.ValueOf를 사용하여 정수로 변경
			cartVO.setCartPrice(Integer.valueOf(str));

			cartList.add(cartVO);

		}

		for (int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartVO.getCartUserName(),
					cartVO.getCatrPName(),
					cartVO.getQty(),
					cartVO.getCartPrice());

		}

	}
}