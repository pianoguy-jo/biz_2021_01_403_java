package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {
	
	public static void main(String[] args) {
		
		ProductVO[] pVO = new ProductVO[5];
						
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0 ; i < pVO.length; i++) {
			pVO[i] = new ProductVO();
		}
		
		//상품코드 입력
		
		System.out.println("상품코드 5개를 입력하시요");
		for(int i = 0 ; i < pVO.length; i++) {
			System.out.print((i+1) + "번째 상품코드 입력>>");
			pVO[i].strPcode = scan.nextLine();			
		}
		
		// 상품명 입력
		System.out.println();
		System.out.println("상품명 5개를 입력하시요");
		for(int i = 0 ; i < pVO.length; i++) {
			System.out.print((i+1) + "번째 상품명 입력>>");
			pVO[i].strPName = scan.nextLine();			
		}
		
		// 거래처 입력
		System.out.println();
		System.out.println("거래처 5개를 입력하시요");
		for(int i = 0 ; i < pVO.length; i++) {
			System.out.print((i+1) + "번째 거래처 입력>>");
			pVO[i].strDName = scan.nextLine();			
		}
		
		// 품목 입력
		System.out.println();
		System.out.println("품목 5개를 입력하시요");
		for(int i = 0 ; i < pVO.length; i++) {
			System.out.print((i+1) + "번째 품목 입력>>");
			pVO[i].strPName = scan.nextLine();			
		}
		
		// 매입단가 입력
		System.out.println();
		System.out.println("매입단가 5개를 입력하시요");
		for(int i = 0 ; i < pVO.length; i++) {
			System.out.print((i+1) + "번째 매입단가 입력>>");
			pVO[i].iPrice = scan.nextInt();			
		}
		
		// 매출단가 입력
		System.out.println();
		System.out.println("매출단가 5개를 입력하시요");
		for(int i = 0 ; i < pVO.length; i++) {
			System.out.print((i+1) + "번째 매출단가 입력>>");
			pVO[i].oPrice = scan.nextInt();			
		}
		for(int i = 0; i < pVO.length; i++) {
		System.out.println(pVO[i].toString());
		}
	
	}
}
