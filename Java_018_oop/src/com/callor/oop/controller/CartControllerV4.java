package com.callor.oop.controller;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import com.callor.oop.medel.CartVO;

	public class CartControllerV4 {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			List<CartVO> cartList = new ArrayList<CartVO> ();
			
			
			int nSize = cartList.size();
			for(int i = 0 ; i < 3 ; i++) {
				
				CartVO cartVO = new CartVO();
				
				System.out.print("구매자>>");
				String strUserName = scan.nextLine();
				
				System.out.print("상품평>>");
				String strPName = scan.nextLine();
				
				
				/*
				 * 데이터를 키보드에서 입력받는 부분과
				 * VO에 담아 리스트에 추가하는 부분을 분리하여 코딩할 경우
				 * 키보드에 입력한 값을 정수변환하여 값을 담아둘 intQty 변수를
				 * While() 실행 이전에 선언해 두어야 한다.
				 */
				
				int price = 0;
				while(true) {
				System.out.print("단가>>");
				String intPrice = scan.nextLine();
				
				
				try {
					cartVO.setCartPrice(Integer.valueOf(intPrice));
					
					if (cartVO.getCartPrice() < 2) {
						
					}
				} catch (Exception e) {
					
				}
				
					
				}
				
				
				
				
				System.out.print("수량>>");
				String intQty= scan.nextLine();

				
				// 카트정보 생성하기
				
				cartVO.setCartUserName(strUserName);
				cartVO.setCatrPName(strPName);
				cartVO.setCartPrice(Integer.valueOf(intPrice));
				cartVO.setQty(Integer.valueOf(intQty));
				
				// 카트정보 리스트에 추가하기
				cartList.add(cartVO);
			} // end for
			
			
			System.out.println("==============================");
			System.out.println("구매자상품평단가수량");
			System.out.println("------------------------------");
			
			
			nSize = cartList.size();
			for(int i = 0 ; i < cartList.size() ; i++) {
				
				//System.out.printf("%s\t%S\t%d\t%d\n",);
			
			}
			System.out.println("==============================");
				
					
				
				
			}
			
			
		}
