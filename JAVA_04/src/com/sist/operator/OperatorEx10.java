package com.sist.operator;
/**
 * 비교연산자
 * 10 == 10.0f =>두 수중 큰수로 형변환 수행후  연산 true
 * '0' == 0    => false
 * 'A' == 65   => true 
 * 'A'>'B'     => false
 * 'A'+1 !='B' => false
 * @author sist1
 */
public class OperatorEx10 {

	public static void main(String[] args) {
		System.out.printf("10==10.f \t %b\n", (10==10.f) );
		System.out.printf("'0'==0 \t %b\n", ('0'==0) );
		System.out.printf("'A'==65 \t %b\n", ('A'==65) );
		System.out.printf("'A'>'B' \t %b\n", ('A'>'B') );		
		System.out.printf("'A'+1!='B' \t %b\n", ('A'+1!='B') );
		System.out.printf("10.0 ==10.0f \t %b\n", (10.0 ==10.0f) );
		System.out.printf("0.1 ==0.1f \t %b\n", (0.1 ==0.1f) );		
		
	}
//10==10.f 	 true
//'0'==0 	 false
//'A'==65 	 true
//'A'>'B' 	 false
//'A'+1!='B' 	 false
//10.0 ==10.0f 	 true
//0.1 ==0.1f 	 false
}
