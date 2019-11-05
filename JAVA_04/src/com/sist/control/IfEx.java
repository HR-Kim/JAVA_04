package com.sist.control;

import java.util.Scanner;
 
/**
 * if(a>=60){
 *    합격;
 * }else{
 *    불합격;
 * }
 * @author sist1
 *
 */
public class IfEx {

	public static void main(String[] args) {
		System.out.println("숫자를 입력 하세요.");
		Scanner  scanner=new Scanner(System.in);
		
		String input = scanner.nextLine();
		int a = 40;
        a     = Integer.parseInt(input);
		
		
		if(a>=60){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}

	}

}
