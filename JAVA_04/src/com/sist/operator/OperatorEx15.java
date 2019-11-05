package com.sist.operator;
/**
 * Bit연산자 : &,|,^,~
 * ----------------------
 * x	y	x|y	x&y	x^y	~
 * ----------------------
 * 1	1	1	1	0	0
 * 1	0	1	0	1	0
 * 0	1	1	0	1	1
 * 0	0	0	0	0	1
 * ----------------------
 * @author sist1
 *
 */
public class OperatorEx15 {

	public static void main(String[] args) {
		int x = 0xAB;//OXAB,10101011
		int y = 0xF ;//     00001111
		//toBinaryString(17);
		
		System.out.printf("x=%#X \t%s\n",x,toBinaryString(x));
		System.out.printf("y=%#X \t%s\n",y,toBinaryString(y));
		
		//|
		System.out.printf("%#X | %#X = %#X \t%s\n",x,y,x|y,toBinaryString(x|y));
		//00000000000000000000000010101011
		//00000000000000000000000000001111
		//--------------------------------
		//00000000000000000000000010101111
		
		//&
		System.out.printf("%#X & %#X = %#X \t%s\n",x,y,x&y,toBinaryString(x&y));
		//00000000000000000000000010101011
		//00000000000000000000000000001111
		//--------------------------------
		//00000000000000000000000000001011
			
		//^
		System.out.printf("%#X ^ %#X = %#X \t%s\n",x,y,x^y,toBinaryString(x^y));
		//00000000000000000000000010101011
		//00000000000000000000000000001111
		//--------------------------------
		//00000000000000000000000010100100

		byte p = 10;
		//~
		System.out.printf("p=%d\t%s\n",p,toBinaryString(p));
		System.out.printf("~p=%d\t%s\n",~p,toBinaryString(~p));
		
	}
	
	/**
	 * 10진 정수를 2진수로 변환: 32bit 2진수 변환 
	 * @param x
	 * @return 32bit 2진수
	 */
	public static String toBinaryString(int x){
		String zero = "00000000000000000000000000000000";
		String tmp  = zero+Integer.toBinaryString(x);
		System.out.println(tmp+":"+tmp.length());
		String str = tmp.substring(tmp.length()-32);
		System.out.println(str+":"+str.length());
		//log.debug()
		return tmp.substring(tmp.length()-32);
	}

}
