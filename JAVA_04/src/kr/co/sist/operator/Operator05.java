package kr.co.sist.operator;

public class Operator05 {
/**
 * 형변환: 큰사이즈에 형에 대입하기
 * @param args
 */
	public static void main(String[] args) {
		int inum = 160;
		System.out.println("키는"+ inum + "센티미터 입니다.");
        
		System.out.println("double 형 변수에 대입합니다.");
        
		double dnum = inum;
        
		System.out.println("키는 "+ dnum + "센티미터 입니다.");

	}
//	키는160센티미터 입니다.
//	double 형 변수에 대입합니다.
//	키는 160.0센티미터 입니다.
}
