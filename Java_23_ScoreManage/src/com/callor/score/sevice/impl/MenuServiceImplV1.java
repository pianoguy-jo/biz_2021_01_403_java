package com.callor.score.sevice.impl;

import java.util.Scanner;

import com.callor.score.sevice.MenuService;
import com.callor.shop.Values;

public class MenuServiceImplV1 implements MenuService{
	
	private final Scanner scan;
	
	public MenuServiceImplV1() {
		
		scan = new Scanner(System.in);
	}
	
	public Integer selecMenu() {
		
		while(true) {
			System.out.println(Values.dLine);
			System.out.println("빛나리 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			
			System.out.printf("%d. 학생성적 점수 생성\n",
					Values.MENU_INPUT);
			System.out.printf("%d. 학생성적 점수 파일 저장\n",
					Values.MENU_ALL_LIST);
			System.out.printf("%d. 성적결과 확인\n",
					Values.MENU_USER_LIST);
						
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.sLine);
			System.out.print("선택>> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				
				Integer intMenu = null;
				try {
					intMenu = Integer.valueOf(strMenu);
				} catch (Exception e) {
					System.out.printf("메뉴는 QUIT, "
							+ "%d ~ %d 까지만 가능",
							Values.MENU_START,
							Values.MENU_LAST);
					continue;
				}
				if(intMenu >= Values.MENU_START 
						&& intMenu <= Values.MENU_LAST) {
					return intMenu;
				} else {
					System.out.printf("업무는 "
							+ "%d ~ %d까지 중에서 선택",
							Values.MENU_START,
							Values.MENU_LAST);
				}
			}
		}
		

		
				
				
		
	
	

		

	}
	
	

}
