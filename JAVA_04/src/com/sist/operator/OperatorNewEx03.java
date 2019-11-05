package com.sist.operator;

public class OperatorNewEx03 {

	public static void main(String[] args) {
		System.out.printf("binNum=%s, %d\n",Integer.toBinaryString(0b0100),0b0100);

		System.out.printf("binNum=%s, %d\n",Integer.toBinaryString(0b0100<<2),0b0100<<2);

		short data = (2<<7) | (10<<2) |1;
		
		System.out.printf("data=%s\n",Integer.toBinaryString(data));
//		binNum=100, 4
//		binNum=11111111111111111111111111111011
//		binNum=100
//		binNum=111
//		binNum=11
	}

}
