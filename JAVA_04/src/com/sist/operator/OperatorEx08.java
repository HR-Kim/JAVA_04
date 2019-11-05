package com.sist.operator;

public class OperatorEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //for(int i=0;i<26;i++){
		// abcde...z
		//}
		char c = 'a';//97
		for(int i=0;i<26;i++){
			System.out.print(c++);
			//System.out.print( (char) ((c-32)+i) );
		}
		
		System.out.println("");
		c = 'A';//65
		for(int i=0;i<26;i++){
			System.out.print(c++);
		}
		
		System.out.println("");
		
		c = '0';
		for(int i=0;i<10;i++){
			System.out.print(c++);
		}
		
		//영문자만 입력 하게 처리 
		//ex)[0-9a-zA-Z]
		
		
	}

}
