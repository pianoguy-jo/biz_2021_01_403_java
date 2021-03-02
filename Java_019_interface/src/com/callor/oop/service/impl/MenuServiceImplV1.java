package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	Scanner scan;

	public void selectMenu() {

		String str1 = "카트추가";
		String str2 = "카트삭제";
		String str3 = "카트리스트";
		String str4 = "끝내기";
		String strNenu = "Q";
		int num = 0;

		System.out.println("===========================");
		System.out.println("Java Menu System v1.");
		System.out.println("---------------------------");

		System.out.println("1. " + str1);
		System.out.println("2. " + str2);
		System.out.println("3. " + str3);
		System.out.println("Q. " + str4);

		System.out.println("---------------------------");		

		while (true){
		scan = new Scanner(System.in);
		System.out.print("선택 >> ");
		strNenu = scan.nextLine();

		
		try {
			num = Integer.valueOf(strNenu);

			if (num == 1) {
				System.out.println(str1);
				break;
			} else if (num == 2) {
				System.out.println(str2);
				break;
			} else if (num == 3) {
				System.out.println(str3);
				break;
			} else if (strNenu == "Q") {
				break;

			}
		} catch (ExceptionInInitializerError ei ) {
			System.out.println(str4);
			break;

		}
		catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
			

	}
		}}
}
		