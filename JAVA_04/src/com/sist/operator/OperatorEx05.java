package com.sist.operator;

public class OperatorEx05 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		//long b = 2_000_000l;
		
		long c = a*b;
		System.out.println("c="+c);//c=-1454759936

	}

}
