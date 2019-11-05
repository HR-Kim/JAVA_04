package com.sist.operator;

import java.util.Scanner;

/**
 * 문자를 1개 입력 받아 영문자, 숫자인지 ?
 * @author sist1
 *
 */
public class OperatorEx13 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch =' ';//\u0000
		System.out.println("문자 1개 입력 하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		System.out.println("ch="+ch);
		
		if('0'<= ch && ch <='9'){// 0<=ch<=9
			System.out.println("입력하신 문자는 숫자 입니다.");
		}
		
		if( ('a'<=ch && ch <='z')||('A'<=ch && ch <='Z') ){
			System.out.println("입력하신 문자는 영문자 입니다.");
		}

//		if( 'A'<=ch && ch <='Z'){
//			System.out.println("입력하신 문자는 영문 대문자 입니다.");
//		}		
		

	}

}
