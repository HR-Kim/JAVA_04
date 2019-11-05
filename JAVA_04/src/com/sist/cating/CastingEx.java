package com.sist.cating;

/**
 * casting
 * double d = 85.4;
 * int score = (int)d;
 * 
 * @author sist1
 *
 */
public class CastingEx {

	public static void main(String aa[]) {
		double d = 85.4;
		
		int    score = (int)d;//Type mismatch: cannot convert from double to int
		System.out.println("d="+d);
		System.out.println("score="+score);//double -> int 소숫점 이하 버림 발생.
		
		System.out.println("===========================");
		int     num  =65;
		char    cNum = 'A';//int    cNum = 'A'; 묶시적 형변환
		System.out.println("num="+num);//65
		System.out.println("num="+(char)num);//A
		
		System.out.println("cNum="+cNum);//A
		System.out.println("cNum="+(int)cNum);//65
		
	}
//	d=85.4
//	score=85
//	===========================
//	num=65
//	num=A
//	cNum=A
}
