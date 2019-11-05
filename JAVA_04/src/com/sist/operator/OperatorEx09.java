package com.sist.operator;
/**
 * float
 * Math.round(): 반올림
 * float pi = 3.141592f
 * @author sist1
 * 
 * String str = "1234";
 * String str01=new String("1234");
 * if(str ==str01):X
 * if(str.equals(str01)):O
 */
public class OperatorEx09 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000+0.5)/1000f;
		System.out.println("shortPi="+shortPi);//shortPi=3.141
		
		double pi01 = 3.141592;
		double doublePi = Math.round(pi*1000)/1000.0;
		System.out.println("doublePi="+doublePi);//doublePi=3.142
		
	}

}
