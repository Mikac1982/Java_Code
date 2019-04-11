package com.class18_2;

public class NestedLoopDemo {
	
   public static void main(String[] args) {
	
	   NestedLoopDemo obj=new NestedLoopDemo();
	   
	   obj.printNum();
	   
   }
   
   void printNum () {
	   

	   for (int i=1; i<=3; i++) {       // outer loop
		   
		   for (int y=1; y<=3; y++) {   // inner loop
			   
	   System.out.println(i+" "+y);  //11; 12; 13 //21; 22; 23 // 31; 32; 33 
			   
			  
		   }
	   }
   }
   
}
