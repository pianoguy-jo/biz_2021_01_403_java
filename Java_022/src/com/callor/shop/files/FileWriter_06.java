package com.callor.shop.files;

import com.callor.shop.servic.impl.RndServiceImplV2;

public class FileWriter_06 {
	
	public static void main(String[] args) {
		
		//String fileName = "src/com/callor/shop/nums_rnd.txt";
		RndServiceImplV2 rService = new RndServiceImplV2();
		rService.makeRnd();
		//rService.saveFileRand(fileName);
	}

}
