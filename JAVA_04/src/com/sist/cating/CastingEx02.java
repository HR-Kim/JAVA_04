package com.sist.cating;
/**
 * float type casting
 * float -> double
 * 
 * @author sist1
 *
 */
public class CastingEx02 {

	public static void main(String[] args) {
		float  f  = 9.1234567f;
		double d  = 9.1234567;
		
		double d2 = (double)f;
		
		System.out.printf("f=%20.18f\n", f);  //
		System.out.printf("d=%20.18f\n", d);  //f= 9.123456954956055000
		System.out.printf("d2=%20.18f\n", d2);//d2=9.123456954956055000
	}

}
