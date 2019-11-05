package com.sist.operator;
/**
 * String str   = "개발자";
 * String str01 = new String("개발자");
 * if(str == str01)
 * if(str.equals(str01))
 * @author sist1
 */
public class OperatorEx11 {
	public static void main(String[] args) {
		String str   = "개발자";
		String str01 = new String("개발자");
		System.out.println("str==str01        \t"+(str==str01));
		System.out.println("str.equals(str01) \t"+(str.equals(str01)));
		
		
	}
//	str==str01        	false
//	str.equals(str01) 	true
}
