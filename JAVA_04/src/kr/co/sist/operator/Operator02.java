package kr.co.sist.operator;

public class Operator02 {
/**
 * 증가 감소 연산자
 * 
 * @param args
 */
	public static void main(String[] args) {
        
		int a = 0;
        
		int b = 0;
        
		//b = a++;
        
		//System.out.println("대입 후에 증가 연산자를 사용했습니다. b의 값은 " + b + "입니다.");
		b = ++a;
        
		System.out.println("대입 전에 증가 연산자를 사용했습니다. b의 값은 " + b + "입니다.");
	}
//대입 후에 증가 연산자를 사용했습니다. b의 값은 0입니다.
//대입 전에 증가 연산자를 사용했습니다. b의 값은 1입니다.
}
