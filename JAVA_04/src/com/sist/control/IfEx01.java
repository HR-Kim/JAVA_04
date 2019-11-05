package com.sist.control;

public class IfEx01 {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 0;
		
		if(a>b)
		{
			System.out.println("a가 크다.");
			c = a;
		}
		else
		{
			
			System.out.println("b가 크다.");
			c = b;			
		}
		 
		System.out.printf("큰 값은 %d\n",c);

	}

}
