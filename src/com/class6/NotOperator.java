package com.class6;

public class NotOperator {
   public static void main(String[] args) {
	// not operator ! --> reverse your condition from true to false and opposite!
	   
  boolean a=!true;

//    System.out.println("The value of boolean variable is "+a );
	   
  boolean snow=true;
    // if it is not snowing --> i will come to the class
    //             otherwise--> i will stay at home
  
    if (!snow) {      // reverse your condition    not true 
    	System.out.println("I will come to the class");
    }
    
    int x=10;
    int y=20;
    
    if (!(x>y)) {
    	System.out.println("hello");
   
    }
    }   
    
}
