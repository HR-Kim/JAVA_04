package com.sist.operator;

public class OperatorEx01 {

	public static void main(String[] args) {
		int i=5;
		int j=0;
		
		j = i++;//i=i+1;
		System.out.println("i="+i+"\tj="+j);
		
		i = 5;
		j = ++i;
		System.out.println("i="+i+"\tj="+j);
		

	}
//i=6	j=5
//i=6	j=6
}
