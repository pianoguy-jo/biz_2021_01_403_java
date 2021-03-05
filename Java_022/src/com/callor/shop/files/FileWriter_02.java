package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {
		
	public static void main(String args[]) {
		
		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		int[] nums = new int[100];
		
		// 배열을 만들고 배엘에 난수 채워넣기
		for(int i = 0 ; i < nums.length; i++) {
			nums[i] = rnd.nextInt(1000)+1;
		}
		
		
		
		FileWriter fileWrite = null;
		PrintWriter printer = null;
		
		try {
			fileWrite = new FileWriter(numsFile);
			printer = new PrintWriter(fileWrite);// 파일을 열려있는 상태이므로 최대한 코드를 줄여한 한다. 오류 발생 가능
			
			
			// nums 배열에 담긴 전체리스트를 향상된 for로 반복하면서 파일에 출력
			for (int n : nums) {
				printer.print(n);
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
