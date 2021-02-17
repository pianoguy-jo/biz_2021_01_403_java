package com.callos.start.boo;

public class BoolAlge_01 {
/*
 * Boolean algebra
 * 
 * (3X *3) + (4X * 2) + (5X *3)
 *  A         B          C
 *  A + B + C
 *  
 * 
 */
	public static void main(String arge[]) {
		
		boolean bYes1 = true;  // 1
		boolean bYes2 = false; // 0
		
		// && : AND
		System.out.println(bYes1 && bYes2);
		// ||(filter 기호) : OR
		System.out.println(bYes2 || bYes1);
		
		// bYes  OR bYes2
		// 1     +    0    =   1
		// 0     +    1    =   1 
		// 0     +    0    =   0
		// 1     +    1    =   2(1이상은 무조건 true)
		
		// true    OR    true    == true
		// true    OR    false   == true
		// false   OR    true    == true
		// false   OR    false   == false
		
		// 1        *      1      ==  1
		// true    AND    true    == true
		// 1        *      0      ==  0
		// true    AND    false   == false
		// 0        *      1      ==  0
		// false    AND    true   == false
		// 0        *      0      ==  0
		// false    AND    false  == false
		
		System.out.println("==============================");
		System.out.println("t && t : " + (true && true));
		System.out.println("t && f : " + (true && false));
		System.out.println("f && t : " + (false && true));
		System.out.println("f && f : " + (false && false));
		System.out.println("==============================");
		System.out.println("t || t : " + (true || true));
		System.out.println("t || f : " + (true || false));
		System.out.println("f || t : " + (false || true));
		System.out.println("f || f : " + (false || false));
		System.out.println("==============================");
		
		
		
	}
}

