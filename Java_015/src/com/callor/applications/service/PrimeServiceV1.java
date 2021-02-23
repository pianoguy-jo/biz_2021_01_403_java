package com.callor.applications.service;

public class PrimeServiceV1 {

	public void prime(int keyNum) {

		int index = 0;
		for (index = 2; index < keyNum; index++) {

			if (keyNum % index == 0) {
				break;
			}

			
		}
		if (index < keyNum) {
			System.out.println("약수입니다.");

		} else {
			System.out.println("소수입니다.");
		}


	}
}
