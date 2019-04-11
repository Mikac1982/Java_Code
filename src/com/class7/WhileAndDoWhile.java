package com.class7;

public class WhileAndDoWhile {
   public static void main(String[] args) {
	
	  int a=10;
	  
	  do {    // first we do ACTION (executed first) and then we check condition
		  System.out.println("Hello");
		  a++;
		  
	  }while (a<15);  // we are first checking CONDITION and then executed (if it's true)    
	//------------------------------------------------------------------------------------
	  
	  int b=10;
	  
	  while (b<15) {  //just executed when condition is true!
		  System.out.println("Byw");
		  b++;
	  }
	  
	   
	   
}
}
