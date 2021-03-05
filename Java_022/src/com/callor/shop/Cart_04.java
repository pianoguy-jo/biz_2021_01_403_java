package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.model.CartVO;

public class Cart_04 {

	public static void main(String[] args) {
		
		CartVO vo1 = new CartVO();
		
		//매개변수가 없는 생성자를 호출하여 객체를 생성하고
		// setter method를 사용하여 데이터 저장
		vo1.setUserName("홍길동");
		vo1.setProdectName("초코파이");
		vo1.setQty(10);		
		vo1.setPrice(1000);
		
		// 매개변수가 있는 생성자를 호출하여
		// 객체를 생성하면서 동시에 데이터를 저장
		// 이럴경우 데이터가 바뀌어도 모를 수가 있다.
		CartVO vo2 = new CartVO("홍길동", "신라면", 20, 500);
		CartVO vo3 = new CartVO("칠성사이다", "성춘향", 20, 500);
		
		// 매개변수가 있는 생성자 일 것이다.
		Scanner scan = new Scanner(System.in);


	}

}
