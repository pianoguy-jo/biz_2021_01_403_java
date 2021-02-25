package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03T {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ProductVO[] pVOs = new ProductVO[5]; // 선언
		for (int i = 0; i < pVOs.length; i++) {

			pVOs[i] = new ProductVO();
		}

		System.out.println("========================");
		System.out.println("나라쇼핑 상품관리  V1");
		System.out.println("========================");

		String strN = 3 + ""; // 숫자 문자열로 저장 :"3" 이라는 문자열로 저장 "" <--- 빈칸이 있으면 안됨
		int intN = Integer.valueOf(strN);

		for (int i = 0; i < pVOs.length; i++) {

			String pCode = (i + 1) + "";
			pVOs[i].strPcode = pCode;

			System.out.println(pCode + "번 상품 정보 입력");
			System.out.print("상품코드입력>>");
			pVOs[i].strPcode = scan.nextLine();

			System.out.print("상품명입력>>");
			pVOs[i].strPName = scan.nextLine();

			System.out.print("거래처입력>>");
			pVOs[i].strDName = scan.nextLine();

			System.out.print("품목입력>>");
			pVOs[i].strItem = scan.nextLine();

			while (true) {
				System.out.print("매입단가>>");
				String iPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(iPrice);
				if (intIPrice < 0) {

					System.out.println("매출단가는 0이상 입력하세요");
					// 정상처리되었으면, 단가가 0 이상입력되었으면 VO에 값을 저장하고
					// 다음 단계로 진행 현 시점의 while() 중단하라
				} else {
					pVOs[i].iPrice = intIPrice;
					break;
				}

				System.out.print("매출단가>>");
				String oPrice = scan.nextLine();
				pVOs[i].oPrice = Integer.valueOf(oPrice);
				if (pVOs[i].oPrice < 0) {
					System.out.println("매출단가가 잘 못 입력되었습니다.>>");
					System.out.print("0 보다 큰 단가를 입력하세요");
					iPrice = scan.nextLine();
					pVOs[i].oPrice = Integer.valueOf(iPrice);
				}

				pVOs[i].toString();

			}

		}
	}
}
