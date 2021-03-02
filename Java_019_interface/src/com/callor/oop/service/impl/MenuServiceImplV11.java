package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV11 {
	
	/*
	 * 인스턴스 객체변수 선언
	 * 생성자에서 객체변수 초기화하여 사용할 준비
	 */

	private Scanner scan;
	
	public MenuServiceImplV11() {
		
		scan = new Scanner(System.in);
	
	}

	public void selectMenu() {

		String str1 = "카트추가";
		String str2 = "카트삭제";
		String str3 = "카트리스트";
		String str4 = "끝내기";
		String strMenu = "Q";
		int intMenu = 0;

		while (true) {

			System.out.println("===========================");
			System.out.println("Java Menu System v1.");
			System.out.println("---------------------------");

			System.out.println("1. " + str1);
			System.out.println("2. " + str2);
			System.out.println("3. " + str3);
			System.out.println("QUIT. " + str4);

			System.out.println("---------------------------");		
				
			System.out.print("선택 >> ");
			strMenu = scan.nextLine();
			
			//1. Q를 입력하면 끝내기
			
			if(strMenu.equals("QUIT")) {
				System.out.println(str4);
				return;
				
			//2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리	
			try {
				intMenu = Integer.valueOf(strMenu);

					if (intMenu == 1) {
						System.out.println(str1);
						break;
					} else if (intMenu == 2) {
						System.out.println(str2);
						break;
					} else if (intMenu == 3) {
						System.out.println(str3);
						break;
					} else  {
						System.out.println("메뉴는 1 ~3 까지만 입력");
						continue;

					}
					break;
				} catch (Exception e) {
					System.out.println("숫자 Q ~ 3까지 만 입력하세요");
					break;

				}

				}
			}
		}
	}
