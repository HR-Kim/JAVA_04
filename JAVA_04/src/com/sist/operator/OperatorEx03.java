package com.sist.operator;
/**
 * +
 * -
 * /
 * %
 * *
 * @author sist1
 *
 */
public class OperatorEx03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		//a+b = 14
		System.out.printf("%d+%d=%d\n",a,b,a+b);//10+4=14
		System.out.printf("%d-%d=%d\n",a,b,a-b);//10-4=6
		System.out.printf("%d*%d=%d\n",a,b,a*b);//10*4=40
		System.out.printf("%d/%d=%d\n",a,b,a/b);//10/4=2
		System.out.printf("%d/%f=%f\n",
				a,
				(float)b,a/(float)b);//10/4.000000=2.500000
		System.out.printf("%d\n",a%b);
		
		System.out.println("a/0.0="+(a/0.0));
		System.out.println("a/0="+(a/0));

	}
//10+4=14
//10-4=6
//10*4=40
//10/4=2
//10/4.000000=2.500000
//2
//a/0=Infinity	
//Exception in thread "main" java.lang.ArithmeticException: / by zero
	
	
	
}
