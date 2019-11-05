package kr.co.sist.operator;

public class Operator07 {
/**
 * 형변환: 다른 형끼리 연산하기
 * 두 피연산자의 크기를 비교하여 그 중에서 큰 데이터형으로 형 변환시킨 후, 연산을 수행
 * @param args
 */
	public static void main(String[] args) {
		int d = 2;
        
		double pi = 3.14;
        
        

		System.out.println("지름이 " + d + "센티미터인 원의 ");
        
		System.out.println("둘레는 " + (d*pi) + "센티미터 입니다.");

	}
//	지름이 2센티미터인 원의 
//	둘레는 6.28센티미터 입니다.
}
