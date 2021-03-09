package com.com.iolist;

import com.com.service.Loo9Service;
import com.com.service.impl.Loo9ServiceImplV1;

public class Loo9 {
	
	public static void maim (String args [] ){
		
		Loo9Service l9S = new Loo9ServiceImplV1();
		
		l9S.loadScoreFromFile();
		l9S.sumPrice();
		l9S.print();
		
		
		
		
	}

}
