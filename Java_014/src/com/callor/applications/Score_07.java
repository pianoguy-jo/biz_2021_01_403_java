package com.callor.applications;

import com.callor.applications.sevrvice.ScoreSeviceV1;

public class Score_07 {
	public static void main(String[] args) {
		ScoreSeviceV1 ssV1 = new ScoreSeviceV1();
		ssV1.makeNamesAndArrayInt();
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.print();
	}
}
