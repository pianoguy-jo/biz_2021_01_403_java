package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
	
	public static void main(String[] args) {
		
		/*
		 * List
		 * 배열과 성질이 유사한 java의 클래스
		 * 개수가 정해지지 않은(최소는 0개) 배열을 생성하는것과 같다
		 */
		
		ArrayList<String> books = new ArrayList<String>();
		List<String> strNames = new ArrayList<String>();
		
		
		//books리스트에 저장된 데디터들 중에서
		//0번 위치에 저장된 데이트럴 Console출력하라
		
		
		try {
			
			System.out.println("여기는 add전");
			System.out.println(books.get(0));
					}
		catch (Exception e) {
			
		}
		
		

		
		// books List에 도서명 추가하기
		// List에 add() method를사용하여 값을'추가'하면 자동으로 개수가 추가되면서 데이터가 저장된다
		
		books.add("자바프로그래밍");
		books.add("자바의 정석");
		books.add("그리스로마신화");
		
try {
			
			System.out.println("여기는 add후");
			System.out.println(books.get(0));
			System.out.println(books.get(1));
			System.out.println(books.get(2));
					}
		catch (Exception e) {
			
		}
		
	
	}

}
