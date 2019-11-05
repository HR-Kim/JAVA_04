package com.sist.operator;
/**
 * 삼항 연산자
 * 
 * 조건식?식1:식2;
 * 조건식?1:(조건식01?:0:1);//가독성이 떨어 짐 
 * @author sist1
 *
 */
public class OperatorEx16 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		int absX;
		int absY;
		int absZ;
		
		char signX;
		char signY;
		
		x = 10;
		y = -5;
		z =  0;
		
		//절대값으로: (x<0)? -x:x;
		absX = (x>=0)? x:-x;
		absY = (y>=0)? y:-y;
		//부호: + ' ' -
		/*
		 if(x>0 == true){
		  	signX = '+';
	     }else if(x==0 == true){
	      	signX = ' ';
	     }else{
	      	signX = '-';
	     }
		*/
		//signX = x>0?'+':(x==0)?' ':'-';
		signX = singChar(x);
		signY = singChar(y);
		
		System.out.printf("x=%c \t %d\n",signX,absX);
		System.out.printf("y=%c \t %d\n",signY,absY);

	}

	/**
	 * 부호화 char return;
	 * @param x
	 * @return char
	 */
	public static char singChar(int x){
		return x>0?'+':(x==0)?' ':'-';
	}
	
	
}
