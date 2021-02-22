package com.callor.applications;

import com.callor.applications.sevrvice.ScoreSeviceV1;

public class Score_06 {
	
		public static void main(String[] args) {
			
			ScoreSeviceV1 ssV1 = new ScoreSeviceV1();
			ssV1.init();
			ssV1.inpuNames();
			ssV1.inputScore();
			ssV1.print();
			
		
	}

}
