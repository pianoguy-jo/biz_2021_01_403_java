package com.callor.start;

import java.util.Random;

public class Loto {
	public static void main(String args[]) {
		Random rnd = new Random();
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;

		for (int i = 0; i < 7; i++) {
			num = i;
			int lotoNum = rnd.nextInt(45) + 1;

			if (num == 0) {
				num1 = lotoNum;

			} else if (num == 1) {
				num2 = lotoNum;

			} else if (num == 2) {
				num3 = lotoNum;

			} else if (num == 3) {
				num4 = lotoNum;

			} else if (num == 4) {
				num5 = lotoNum;

			} else if (num == 5) {
				num6 = lotoNum;

			} else if (num == 6) {
				num7 = lotoNum;
			}

		}
		boolean lotoNum01 = ((num1 != num2) != (num3 != num4) != (num5 != num6));
		boolean lotoNum02 =  

	}
}
