package com.sist.operator;
/**
 * 
 *
 * ( (x>10) && (x<20) )
 * ex) 
 * if( (x>10) == true ){

 * }

 * (i%2 == 0) && (i%3 == 0)
 * @author sist1
 *
 */
public class OperatorEx12 {
	public static void main(String[] args) {		
		int x  = 0;
		char ch = ' ';
		//논리연산자.(||,&&)
		//비교연산자 && 비교연산자
		//x<4 && x>7
		
		x = 15;
		//(x>10) && (x<20) true
		System.out.printf("(x>10) && (x<20) %b\n",(x>10) && (x<20));
		
		x = 8;
		//(i%2 == 0) || (i%3 == 0) false
		System.out.printf("(i%%2 == 0) || (i%%3 == 0) %b\n",(x%2 == x%3) || (x%3 == 0));
	}

}
