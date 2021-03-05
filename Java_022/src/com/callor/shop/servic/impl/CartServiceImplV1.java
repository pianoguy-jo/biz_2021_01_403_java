package com.callor.shop.servic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.servic.CartService;
import com.callor.shop.values.Values;

public class CartServiceImplV1 implements CartService{

	
	/*
	 * ImplV1dptj inputCart() method를 사용하여 cartList에 상품리스트를 추가하고
	 * 
	 * ImplV1을 상속받은 ImplV2의 새로운 save...() method에서
	 * cartList에 저장된 데이터를 사용하려고 시도했다.
	 * 
	 * 이러한 경우에 private으로 선언되 변수(객체)는 서로 공유가 되지 않습니다.
	 * 상속받은 클래스의 method에서 변수(객체)를 서로 공유하려면 부모클레스에서
	 * 변수(객체)를 반드시 protected로 선언해 주어야 한다.
	 * 또한 상속받은 클래스에서는 해당 변소(객체)를 선언해서는 안된다.
	 */
	protected List<CartVO> cartList;
	private final Scanner scan;
	
	public CartServiceImplV1() {
		
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	
	}
	
	@Override
	public void inputCart() {
		// TODO 카트 추가 method (TODO : 책깔피 기능)
		
		System.out.println(Values.dLine);
		System.out.println("장바구니 추가");
		System.out.println(Values.sLine);
		
		System.out.println("구매자 이름을 입력하세요");
		System.out.println(">>");
		String strUserName = scan.nextLine();
		
		System.out.println("추가할 상품이름을 입력하세요");
		System.out.println(">>");
		String strProductName = scan.nextLine();
		
		System.out.println("추가할 상품의 구매 수량을 입력하세요");
		
		Integer intQty = 0;
		while(true) {
		
		System.out.println(">>");
		String strQty = scan.nextLine();
		try {
			
			intQty = Integer.valueOf(strQty);
			
		} catch (Exception e) {
			
			System.out.println("수량은 숫자만 입력하세요");
			// TODO: handle exception
		}
		if(intQty < 1) {
			
			System.out.println("수량은 1이상 입력하세요");
		} else {
			break;
		}
		
		}
		
		System.out.println("추가할 상품의 가격을 입력하세요");

		Integer intPrice = 0;		
		while(true) {
			
			System.out.println(">>");
			String strPrice = scan.nextLine();
			try {
				
				intPrice = Integer.valueOf(strPrice);
				
			} catch (Exception e) {
				
				System.out.println("가격은 숫자만 입력하세요");
				// TODO: handle exception
			}
			if(intPrice < 1) {
				
				System.out.println("가격은 1이상 입력하세요");
			} else {
				break;
			}
			
			}
		
		Integer intTotal = intQty * intPrice;
		
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProdectName(strProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intTotal);
		
		System.out.println(Values.dLine);
		System.out.println("입력한 상품");
		System.out.println(Values.sLine);
		System.out.printf("구매자 :  %s\n",
				cartVO.getUserName());
		System.out.printf("상품명 :  %s\n",
				cartVO.getProdectName());
		System.out.printf("수량 : %d\n",
				cartVO.getQty());
		System.out.printf("갸격 : %d\n",
				cartVO.getPrice());
		System.out.printf("합계 : %d\n",
				cartVO.getTotal());
		System.out.println(Values.dLine);
		System.out.println("추가할까요(YES)?");
		
		String strYesNo = scan.nextLine();
		if(strYesNo.equals("YES")) {
			cartList.add(cartVO);
			
			System.out.println("저장완료!!");
		} else {
			System.out.println("저장취소!!");
		}
		
	}
	
	/*
	 * private으로 선언된 method는 현재 클래스에서만
	 * 호출이 가능한 method
	 */
	private void printHeader() {
		
		System.out.println(Values.dLine);
		System.out.println("구매자\t상품명\t단가\t수량금액\n");
		System.out.println(Values.sLine);
		
	}
	
	
	private void printBody(CartVO cartVO) { // CartVO cartVO 매개변수로 사용하면 cartVO 오류가 안남
		
		// cartVO에서 각 인스턴스 변수를 읽어서 출력
		System.out.print(cartVO.getUserName() + "\t");
		System.out.printf("%s\t", cartVO.getProdectName());
		System.out.printf("%d\t", cartVO.getQty());
		System.out.printf("%d\t", cartVO.getPrice());
		System.out.printf("%d\n", cartVO.getTotal());
	}

	@Override
	public void printAllCart() {
		
		this.printHeader();
		// TODO 장바구니 전체 보기
		

		//카트리스트의 상품개수를 계산하여 nSize저장
		
		int nSize = cartList.size();
		for(int i = 0 ; i < nSize; i++) {
			
			// cartList.get(i)는 cartList에 저장되어있는 i 번째 요소
			// 이 요소는 결국 CartVO 클래스로 만는다
			/*
			 * System.out.print(cartList.get(i).getPrice() + "\t");
			 * System.out.print(cartList.get(i).getProdectName()+ "\t");// 카트리스트 i번째 요소를
			 * 끄집어내서
			 */
		
			// cartList의 i번째 요소를 getter하여 CartVO 객체에
			// 임시(for()명령 내에 있기 때문에) 선언된
			// CartVO클래스의 cartVO 객체에 저장하라
			// 
			CartVO cartVO = cartList.get(i);
			this.printBody(cartVO);
			

		
		}
		System.out.println(Values.sLine);
	}

	@Override
	public void printUserCart() {
		// TODO 구매자별 장바구니 보기
		
		System.out.println(Values.dLine);
		System.out.println("구매자별 리스트");
		System.out.println("구매자명");
		String strUserName = scan.nextLine();
		
		this.printHeader();
		int nSize = cartList.size();
		for(int i = 0 ; i < nSize; i++) {
			
			CartVO cartVO = new CartVO();
			if(cartVO.getUserName().equals(strUserName)) {
				
				this.printBody(cartVO);
			}
		}
		
		
	}

}
