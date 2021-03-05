package com.callor.shop;

/*
 * interface는 클래스를 선언하기 위한
 * 1. 설계도, 길잡이
 * 2. 이후에 클래스를 업그래이드 하기 위하여 새로 만들어 프로젝트에 적용할 때
 * 		기존 코드의 수정을 최소하 하기 위한 역할도 한다.
 */
public interface MenuService {
	
	public Integer selectMenu();

}
