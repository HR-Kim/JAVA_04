package com.sist.operator;

public class OperatorNewEx02 {

	public static void main(String[] args) {
		System.out.printf("binNum=%s, %d\n",Integer.toBinaryString(0b0100),0b0100);

		System.out.printf("binNum=%s\n",Integer.toBinaryString(~0b0100));
		
		System.out.printf("binNum=%s\n",Integer.toBinaryString(0b0100 & 0b0111));
		
		System.out.printf("binNum=%s\n",Integer.toBinaryString(0b0100 | 0b0111));
		
		System.out.printf("binNum=%s\n",Integer.toBinaryString(0b0100 ^ 0b0111));
//		binNum=100, 4
//		binNum=11111111111111111111111111111011
//		binNum=100
//		binNum=111
//		binNum=11
	}

}
