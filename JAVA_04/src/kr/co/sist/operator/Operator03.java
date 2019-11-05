package kr.co.sist.operator;

import java.util.Scanner;

public class Operator03 {
/**
 * 복합 대입연산자.
 * 
 * @param args
 */
	public static void main(String[] args) {
        
		System.out.println("정수를 3개 입력하십시오.");
        
        
		Scanner br = new Scanner(System.in);
        
        

		String str1 = br.nextLine();
		String str2 = br.nextLine();
		String str3 = br.nextLine();

		int sum = 0;
        
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
        
        

		System.out.println("3개 정수의 합은 " + sum + "입니다.");
	}
//	정수를 3개 입력하십시오.
//	8
//	10
//	13
//	3개 정수의 합은 31입니다.
}
