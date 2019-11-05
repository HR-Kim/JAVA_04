package kr.co.sist.operator;

public class Operator08 {
/**
 * 형변환: 같은 형끼리 연산하기 
 * 두 피연산자의 크기를 비교하여 그 중에서 큰 데이터형으로 형 변환시킨 후, 연산을 수행
 * @param args
 */
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
        
		//double div = num1 / num2;//int/int = int
		
		double div = (double)num1 /(double) num2;//double/double = idoublent
		System.out.println("5/4는 " + div + "입니다.");

	}
//	5/4는 1.0입니다
//  5/4는 1.25입니다.
}
