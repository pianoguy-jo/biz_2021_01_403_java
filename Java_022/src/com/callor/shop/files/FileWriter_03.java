package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_03 {
		
	public static void main(String args[]) {
		
		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		int[] nums = new int[100];
		
		// 리스느를 만들어서 Random 수를 저장하기
		List<Integer> intList =  new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			// 1번 코드
			Integer num = rnd.nextInt(1000)+1;
			
			// 2번코드
			intList.add(rnd.nextInt(1000)+1);
		}
		
		
		
		FileWriter fileWrite = null;
		PrintWriter printer = null;
		
		try {
			fileWrite = new FileWriter(numsFile);
			printer = new PrintWriter(fileWrite);// 파일을 열려있는 상태이므로 최대한 코드를 줄여한 한다. 오류 발생 가능
			
			
			// nums 배열에 담긴 전체리스트를 향상된 for로 반복하면서 파일에 출력
			for (Integer n : nums) {
				printer.print(n);
			}
			
			//표준형 for로 반복하면서 파일에 출력
			int nSize = intList.size();
			for(int i = 0 ; i < nSize; i++ ) {
				
				Integer n = intList.get(i);
				printer.println(n);
			}
			

			
			printer.close();
			fileWrite.close();
			
			System.out.println("Mission Complete!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
