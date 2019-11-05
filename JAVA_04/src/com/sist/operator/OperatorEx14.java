package com.sist.operator;
/**
 * 효율적인 연산
 * true  || 검사하지 않음 :
 * false && 검사하지 않음 : 
 * @author sist1
 */
public class OperatorEx14 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		//|| 앞이 true 뒤쪽은 검사하지 않는다.
		
		//5 	 0
		System.out.printf("%d \t %d\n",a,b);
		//a!=0 || ++b!=0 true
		System.out.printf("a!=0 || ++b!=0 %b\n",( a!=0 || ++b!=0));	
		//5 	 0
		System.out.printf("%d \t %d\n",a,b);
		
		//&& 앞이 false 뒤쪽은 검사하지 않는다.
		//a ==0 && ++b!=0 false
		System.out.printf("a ==0 && ++b!=0 %b\n",( a==0 && ++b!=0));
		//5 	 0
		System.out.printf("%d \t %d\n",a,b);
		
		//!
		boolean b01 = true;
		char ch     = 'C';
		
		System.out.printf("b01=%b\n",b01);//b01=true
		System.out.printf("!b01=%b\n",!b01);//!b01=false
		
		//('a'<=ch && ch <='z')
		//!('a'<=ch && ch <='z')=false
		System.out.printf("('a'<=ch && ch <='z')=%b\n",('a'<=ch && ch <='z'));//!b01=false
		//!('a'<=ch && ch <='z')=true
		System.out.printf("!('a'<=ch && ch <='z')=%b\n",!('a'<=ch && ch <='z'));//!b01=false
		
		
		
		
		
		
		
		
	}

}
