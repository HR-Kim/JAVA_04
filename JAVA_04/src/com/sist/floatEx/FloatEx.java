package com.sist.floatEx;

/**
 * float 정밀도
 * ------------------------
 * Type		정밀도	크기(bit)
 * ------------------------
 * float	  7		32
 * double    15	    64
 * ------------------------
 * 
 * @author sist1
 *
 */ 
public class FloatEx {

	public static void main(String[] args) {
		float	f  = 9.12345678901234567890f;
		float	f2 = 1.2345678901234567890f;
		
		double  d  = 9.12345678901234567890d;
		System.out.println("12345678901234567890");
		System.out.printf("f=%f%n", f);//f=9.123457		
		System.out.printf("f=%24.20f%n", f);//  9.12345695495605500000

		System.out.printf("f2=%24.20f%n", f2);//
		System.out.printf("d=%24.20f%n", d);//d=  9.12345678901234600000
	}

}






