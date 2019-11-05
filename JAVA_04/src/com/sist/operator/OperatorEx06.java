package com.sist.operator;
/**
 * int a = 10_000_000;
 * 왼쪽에서 오른쪽으로 연산 수행.
 * int result01 = a*a/a;
 * int result02 = a/a*a;
 * 
 * 
 * @author sist1
 *
 */
public class OperatorEx06 {

	public static void main(String[] args) {
		int a = 10_000_000;
		int result01 = a*a/a;//overflow
		int result02 = a/a*a;
		
		System.out.println("result01="+result01);
		System.out.println("result02="+result02);
	}
//result01=27 : 곱하기를 먼저 한경우 int범위를 넘어섬.
//result02=10000000
}
