package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_021 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		//VO 클래스를 배열로 선언하고 상용(데이터 저장, 읽기)하려면
		// 선언된 객ㅊ에배열 요소요소를 모두
		// 다시 초기화(생성)하는 과정이 필요하다
		// 이 과정이 생략되면 이후 코드에서 NullpointerException이 발생한다.
				
		ProductVO[] pVOs = new ProductVO[5]; //선언
		for(int  i = 0 ; i < pVOs.length; i++) {
			
			pVOs[i] = new ProductVO();
		}
		
		System.out.println("========================");
		System.out.println("나라쇼핑 상품관리  V1");
		System.out.println("========================");
		
		String strN = 3 + ""; //숫자 문자열로 저장 :"3" 이라는 문자열로 저장 "" <--- 빈칸이  있으면 안됨
		int intN = Integer.valueOf(strN);
		
		for(int i = 0 ; i <pVOs.length ; i++) {
			
			String pCode = (i + 1) + "";
			pVOs[i].strPcode = pCode;
			
			System.out.println(pCode + "번 상품 정보 입력") ;
			System.out.print("상품코드입력>>");
			pVOs[i].strPcode = scan.nextLine();
			
			
			System.out.print("상품명입력>>");
			pVOs[i].strPName = scan.nextLine();
			
						
			System.out.print("거래처입력>>");
			pVOs[i].strDName = scan.nextLine();
			
			
			System.out.print("품목입력>>");
			pVOs[i].strItem = scan.nextLine();
			
			
			System.out.print("매입단가>>");
			String iPrice = scan.nextLine();
			pVOs[i].iPrice = Integer.valueOf(iPrice);
			
			
			System.out.print("매출단가>>");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			
			pVOs[i].toString();
			
			
			
		}
		
		
		
	}

}
