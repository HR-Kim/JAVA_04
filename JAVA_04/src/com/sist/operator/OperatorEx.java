package com.sist.operator;

public class OperatorEx {

	public static void main(String[] args) {		
		int i = 7;
		//i++;
		i=i+1;
		//for(int i=0;i<100;i++){
		//
		//}		
		System.out.println("i="+i);
		i= 7;
		++i;
		System.out.println("i="+i);
        
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65
		
		//1--------------------------------------------
		System.out.println(1+x<<33);
		System.out.println(y >= 5 || x < 0 && x > 2); 
		System.out.println(y += 10 - x++); //y=(y+10 - x++) 13
		System.out.println(x+=2);//x=x+2; 5
		System.out.println( !('A' <= c && c <='Z') );// !(true && true)
		System.out.println('C'-c);//2
		System.out.println('5'-'0'); //5
		System.out.println(c+1);//65+1
		System.out.println(++c);//B
		System.out.println(c++);//B
		System.out.println(c);//C

		
		//2--------------------------------------------		
		int numOfApples = 123; //사과의 개수 // 
		int sizeOfBucket = 10; //바구니의 크기 바구니에 담을 수 있는 사과의 개수  
		int numOfBucket = numOfApples/sizeOfBucket +(numOfApples%sizeOfBucket==0?0:1); //
		System.out.println("바구니 갯수 :"+numOfBucket);
		
		
		
	}

}
