package com.sist.floatEx;
/**
 * 실수를 진수 변환
 * float f = 9.1234567f
 * 
 * @author sist1
 *
 */
public class FloatToBin01 {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int   i = Float.floatToIntBits(f);
		System.out.printf("f=%f%n", f);
		System.out.printf("f=%X%n", i);//16진수:f=4111F9AE <- 4111F9AD
		
 
	}

}
