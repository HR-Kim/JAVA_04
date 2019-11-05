package com.sist.operator;
/**
 * char a ='a';//97
 * char d ='d';//100
 * d - a
 * @author sist1
 *
 */
public class OperatorEx07 {
/**
 * 삭칙연산의 피연산자로 숫자뿐 아나라 문자도 가능.
 * @param args
 */
	public static void main(String[] args) {
		char a ='a';//97
		char d ='d';//100
		
		char zero = '0';//48
		char two  = '2';//50
		
		//100-97
		//d - a=3
		System.out.printf("%c - %c=%d\n",d,a,(d-a));
		//50-48 =2 
		System.out.printf("%c - %c=%d\n",two,zero,(two-zero));
		//a=97
		System.out.printf("%c=%d\n",a,(int)a);
		//d=100
		System.out.printf("%c=%d\n",d,(int)d);
        //0=48
		System.out.printf("%c=%d\n",zero,(int)zero);
	}

}
