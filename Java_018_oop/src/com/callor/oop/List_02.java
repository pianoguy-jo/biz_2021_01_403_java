package com.callor.oop;

import java.util.ArrayList;

/* List클래스
 * 배열의 단점을 보완하기 위해서  java의 JDK 포함되어 있는
 * 데이터리스트를 관리하기 위한 클래스
 * 
 * 1. 데이터(값)들을 다량으로 저장하는 용도의 객체 생성
 * 2. 배열을 선언하여 값을 저장하는 것과 비슷한 용도
 * 3. 처음생성할때 몇개의 데이터를 저장할 지 결정하지 않고
 * 4. 필요에 따라서 추가, 삭제, 수정, 할수 있다.
 *    - 배열은 처음 생성한 개수를 변경하면, 저장되어 있던 데이터를
 *    	사용할 수 없게 된다.
 * 5. add() method를 사용하여 데이터를 추가하고 
 * 6. get(위치) method를 사용하여 저장된 데이터를 읽을 수 있다
 *    - 다른 변수에 저장하거나, 출력할 수 있다.
 *       
 */
public class List_02 {
	
	public static void main(String[] args) {
		
	
		/*
		 * 배열은 처음 생성할 때 지정한 type 이외는
		 * 다른 어떠한 type도 저장할 수 없다.
		 * 
		 * 이미 선언된 배열을 다른 typy으로 다시 선언할 수 없다.
		 */
		int[] nums = new int [10];
		nums[0] = 30;
		//nums[1]	= "30";
		//nums[2] = "대한민국";
		
		//nums = new float[10];
		//nums[3] = 30f;
		
		// ArrayList형 객체 생성
		// List1객체에 여러 type의 데이터를 추가하여
		// 관리하겠다 라는 의미
		ArrayList list = new ArrayList(); // 공통 type의 ArrayList 객채성성(기본형) 
		list1.add(3);
		list1.add("대한민국");
		list1.add(3.2f);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		
		// 권장하는 ArrayList 객체를 생성
		// ArrayList형 객체를 생성하는데
		// strList 객체에는 String type의 데이터들만 추가할 수 있다.
		// <String> : Generic type
		// strList1은 ArrayList 객체이지만
		// 여기에는 문자열만 저장하도록 하겠다.
		// Generic type은 int. float, long, double 등은 사용할 수 없다.
		// Generic type은 Intger, Float, Long, Double, Stgring만 사용해야 한다.
		// Generic type은 VO 클래스를 사용할 수 있다.
		ArrayList<String> strList1 = new ArrayList<String>();
		ArrayList<String> intList = new ArrayList<Integer>();	
		
		
		// strList1은 Generic이 String으로 설정되어 있기 때문에
		// 문자열 외에는 add 할 수 없다.
		strList1.add("대한민국");
		//strList1.add(30);
		//strList1.add(30.0F);
		
		
		// instList1은 Generic이 INTegye로 설정되어 있기 때문에
		// 정수값 이외애는 add 할 수 없다.
		intList.add(30);
		//intList.add("30");
		intList1.add(Integer.valueOf("39"));
		
	}
	
	

}
