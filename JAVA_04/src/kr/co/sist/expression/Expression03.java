package kr.co.sist.expression;

import java.util.Scanner;

public class Expression03 {
/**
 * 키보드로 입력한 값 더하기.
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("정수를 2개 입력하십시오.");
		Scanner br = new Scanner(System.in);
        
		String str1 = br.nextLine();
		String str2 = br.nextLine();
        
		int num1 = Integer.parseInt(str1);
        
		int num2 = Integer.parseInt(str2);
        
		System.out.println("덧셈의 결과는 "+ (num1 + num2) + "입니다.");
	}
//	정수를 2개 입력하십시오.
//	10
//	12
//	덧셈의 결과는 22입니다.
}
