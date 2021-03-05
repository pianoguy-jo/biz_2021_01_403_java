package com.callor.shop.files;

import com.callor.shop.servic.impl.RndServiceImplV11;
import com.callor.shop.servic.impl.RndServiceImplV1;

public class FileWriter_05 {
	
	public static void main(String args[]) {
		
		RndServiceImplV1 riV1 = new RndServiceImplV1();
		RndServiceImplV11 riV2 = new RndServiceImplV11();
		
		
		riV1.RndServiceImplV1();		
		riV2.makeRnd();
		riV2.saveFileRand();
		
		
		
		
		
	}

}
