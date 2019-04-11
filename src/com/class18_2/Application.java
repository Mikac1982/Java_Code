package com.class18_2;

import com.class18.Calculator;  //importing Calculator class from package 18

public class Application {

	public static void main(String[] args) {
		
    ScannerMethod obj=new ScannerMethod();  //created method for Scanner class
  //	obj.sub();
  //	obj.sum(a, b)
		
		
    Calculator obj1=new Calculator();
   
    // int a=10;              // the other way
    // int b=2;
    // int c=obj.sum(a,b);
    //System.out.println(c);
    
    System.out.println(obj1.sum(2, 6));  //8
    System.out.println(obj1.sub(10, 3)); //7
    System.out.println(obj1.div(50,10)); //5	
	obj1.mult(5, 8);	                 //40
		
		
		
		
		
		
	}
	
}
