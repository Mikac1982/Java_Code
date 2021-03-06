package com.class07;

public class IncrementDecrement {
   public static void main(String[] args) {
	
	   int x=1;  // way1
	   x=x+1;
	   System.out.println(x);
	   
	   int y=1;    //same thing way2
	   y+=1;
	   System.out.println(y);
	   
	   int z=1;    //same thing way3
	   z++;
	   System.out.println(z);
	   
	   int w=2;
	   w++;     // ++ is incrementing by 1
	   System.out.println(w);  //3
	   
	   int v=10;
	   v--;     // -- decrementing by 1
	   System.out.println(v);  // 9
	   
	   int a=10;
	   int b=++a;  //10+1=11;  PREINCREMENT: first increment and then assign the value
	   System.out.println("Value of b is "+b);      //11
	   System.out.println("The value of a is "+a);  //11
	   
	   int c=10;
	   int d=c++;  //  POSTINCREMENT: first assign the value by 1 then increment
	   System.out.println("Value of d is "+d);  //10  
	   System.out.println("Value of c is "+c);  //11
	   
	   int q=100;
	   int e=q--;
	   System.out.println("Value of e is "+e);  //100
	   System.out.println("Value of q is "+q); //99
	   
	   int h=50;
	   int g=--h; // first decrement by 1 then assign!
	   System.out.println("Value of g is "+g); //49
	   System.out.println("Value of h is "+h); //49
}
}
