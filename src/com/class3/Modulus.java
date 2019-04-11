package com.class3;

public class Modulus {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		
		int div=a/b;
		
	System.out.println(div);  //3 or 3.3 - because it's integer it can be just 3
	
	  // modulus operator! whatever is left over after operation
	
	  //reminder what is left after division (10:3=3 we can feet 3 values of 3 in 10; 1 is left)
	
	int mod=a%b; //1    
	System.out.println(mod);	//shows whatever is left 
	
	int q=23;
	int w=11;
	
	System.out.println(q%w); //1 -->that is leftover! 
	
	// Parenthess, Exponents, Multiplication/Division, Addition?Subtraction
		
	int	e=-5+4*6;        //19
	int x=(22+9)%7;      //3   31/7=4 4*7=28 to 31 leftover is 3!
	int y=20+ -3*5 /8;   //19
	int z=5+15/3*2-8%3;  //13  (5+10-2) 5+ first 15/3=5 than *2=10 than - moduls from8%3=2 =13
	
	System.out.println(e);   //19
	System.out.println(x);	 //3
	System.out.println(y);   //19
	System.out.println(z);   //13
	
	}

}
