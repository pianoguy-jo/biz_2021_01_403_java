package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {
	
	public static void main(String[] args) {
		
		List<String> strLines = new ArrayList<String>();
		
		String fileName = "src/com/callor/shop/nums_rnd.txt";
		
		/*
		 * 파일을 읽을 때 사용하는 클래스
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			
			/*
			 * 화일 문을 이용한 저수준 코드
			 * 
			 * while(true) {
			 * 
			 * int ascii = fileReader.read(); if(ascii == -1) {//오류(Code point =
			 * 0xffffffff)를 막기위한 코드 break; } System.out.printf("%c\n",ascii);
			 * 
			 * }
			 */
			
			buffer = new BufferedReader(fileReader);//Buffer <-- 임서저장기능(파일을 모두 읽어옴)
			
			while(true) {
				
				//buffer.readLine 파일에 있는 내용을 한줄 씩 읽어 오는 기능
				String str = buffer.readLine();// scanner.nextLine() <--- 스케너 라인과 비슷한 기능
				if(str == null) {
					break;
				}
				//System.out.println(str);
				strLines.add(str);
				
			}
			buffer.close();// 한줄식 받아들여 리스트에 담아 두기
			fileReader.close();
						
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String str : strLines) {
			
			System.out.println(Values.dLine);
			String[] nums = str.split(":");
			System.out.printf("첫번째 숫자 : %s\n", nums[0]);
			System.out.printf("두번째 숫자 : %s\n", nums[1]);
			System.out.printf("세번째 숫자 : %s\n", nums[2]);
			System.out.printf("네번째 숫자 : %s\n", nums[3]);
			System.out.printf("다섯번째 숫자 : %s\n", nums[4]);
			
			System.out.println(Values.sLine);
			
			int sum = Integer.valueOf(nums[0]);
			sum += Integer.valueOf(nums[1]);
			sum += Integer.valueOf(nums[2]);
			sum += Integer.valueOf(nums[3]);
			sum += Integer.valueOf(nums[4]);
			System.out.println("합계: " + sum);
			
			System.out.println(Values.dLine);
			System.out.println();
			System.out.println();

			
			
			
			
			
		}
	}

}
