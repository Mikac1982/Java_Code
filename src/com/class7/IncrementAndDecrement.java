package com.class7;

public class IncrementAndDecrement {
   public static void main(String[] args) {
	   
	//post increment a++;
	
	int a=299;
	int b=a++;  // first assign --> increment (first int b=a; then a=a+1;)
	
	
	System.out.println(a);  //300
	System.out.println(b);  //299
	
	// post decrement x--;
	
	int x=10;
	int y=x;
	
	System.out.println(x+" "+y);  // 10 10
	
	int z=10;
	z--;
	System.out.println(z); //9
	
	int z1=10;
	int c=z1--;
	System.out.println(z1); //9
	System.out.println(c); //10  (c=z1)
}
}
