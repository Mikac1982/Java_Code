package com.class18_2;

public class Arrays {
   public static void main(String[] args) {
	
	 int [] bucky=new int [7];  // you are storing 7 values of int type
	 
	 bucky[0]=33;
	 bucky[1]=4;
	 bucky[2]=55;
	 bucky[3]=111;
	 bucky[4]=69;
	 bucky[5]=200;
	 bucky[6]=100;
	 
	 System.out.println(bucky[5]);
	
	 System.out.println();
	 
	   //         0  1 2   3   4  5   6  7  8
	 int [] num= {33,4,55,111,69,200,100,4,22};
	 
	 int i=0;
	 while (i<=8) {                // to print all values
	  System.out.println(num[i]);
	 i++;
	 } 
}
}
