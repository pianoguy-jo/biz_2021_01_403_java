package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;
import com.callor.oop.model.ProductVO1;

public class Product_01 {
	
	public static void main(String args[]) {
		ProductVO1 prVO = new ProductVO1();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(prVO.toString());
		
				
		// UI
		System.out.println("===============================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("-------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("-------------------------------");
		System.out.println("상품코드>> ");
		prVO.strPcode = scan.nextLine();
		
		System.out.println("상품명>> ");
		prVO.strPName = scan.nextLine();
		
		System.out.println("품목>> ");
		prVO.strItem = scan.nextLine();
		
		prVO.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println("상품코드를 입력하시요"); System.out.print("입력 >> "); prVO.strPcode
		 * = scan.nextLine();
		 * 
		 * System.out.println("상품명를 입력하시요"); System.out.print("입력 >> "); prVO.strPName =
		 * scan.nextLine();
		 * 
		 * System.out.println("품목를 입력하시요"); System.out.print("입력 >> "); prVO.strItem =
		 * scan.nextLine();
		 * 
		 * System.out.println("거래처를 입력하시요"); System.out.print("입력 >> "); prVO.strDName =
		 * scan.nextLine();
		 * 
		 * 
		 * System.out.println("매입단가를 입력하시요"); System.out.print("입력 >> "); prVO.iPrice =
		 * scan.nextInt();
		 * 
		 * System.out.println("매출단가를 입력하시요"); System.out.print("입력 >> "); prVO.oPrice =
		 * scan.nextInt();
		 */		
		
		
		
		
		
		
		
		
		
	}

}
