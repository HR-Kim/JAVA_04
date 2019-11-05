package kr.co.sist.expression;

public class Expression02 {
/**
 * 변수에 값을 사용하기.
 * @param args
 */
	public static void main(String[] args) {
		//컴퓨터는 다양한 일을 계산 해서 처리한다.
		//식(expression)을 배운다.
		//1+2
		//연산자(+):operator
		//피연산자(1):operand
		
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;
        
		System.out.println("변수 num1의 값은 " + num1 + "입니다.");
        
		System.out.println("변수 num2의 값은 " + num2 + "입니다.");
        
		System.out.println("num1+num2의 값은 " + sum + "입니다.");

		num1 = num1 + 1;
		System.out.println("변수 num1의 값에 1을 더하면 " + num1 + "입니다.");

	}
//	변수 num1의 값은 2입니다.
//	변수 num2의 값은 3입니다.
//	num1+num2의 값은 5입니다.
//	변수 num1의 값에 1을 더하면 3입니다.
}
