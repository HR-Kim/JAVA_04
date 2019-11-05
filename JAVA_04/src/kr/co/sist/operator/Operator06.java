package kr.co.sist.operator;

public class Operator06 {
/**
 * 형변환: 작은사이즈 형에 대입하기 
 * @param args
 */
	public static void main(String[] args) {
		double dnum = 160.5;
        
		System.out.println("키는 "+ dnum + "센티미터 입니다.");
        
		System.out.println("int 형 변수에 대입합니다.");
        //명시적으로 형을 변화 시키기.
		int inum = (int)dnum;//반 내림한 정수가 됨.
		System.out.println("키는 "+ inum + "센티미터 입니다.");

	}
//	키는 160.5센티미터 입니다.
//	int 형 변수에 대입합니다.
//	키는 160센티미터 입니다.
}
