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
public class OperatorEx10_1 {

	public static void main(String[] args) {
		float f   = 0.1f;
		double d  = 0.1;
		double d2 = (double)f;
		
		//연산전 형변환을 통해 두 피연산자의 타입을 같게 맞춘 다음 비교.
		//10을 float으로 변환한 다음 비교.
		System.out.printf("10==10.f \t %b\n", (10==10.f) );
		
		//실수형은 근사값으로 저장되므로 오차 발생.
		//0.1f는 2진수로 변환하는 과정에서 오차 발생.
		System.out.printf("0.1==0.1f \t %b\n", (0.1==0.1f) );	
		
		System.out.printf("f=%19.17f\n", f );//0.10000000149011612	
		System.out.printf("d=%19.17f\n", d );//0.10000000000000000
		
		System.out.printf("d=f %b\n", d==f );
		System.out.printf("d=d2 %b\n", d==d2 );
		System.out.printf("d2=f %b\n", d2==f );
	}

}
