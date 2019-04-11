package com.class18;

public class SquareOutline {
   public static void main(String[] args) {
	   
	// I want to print pattern
	// ******   rows=4; columns=6
	// *    *
	// *    *
	// ******
	 
	   SquareOutline obj=new SquareOutline();
	   obj.printPatern();
	   
}
   
   void printPatern() {
	   
	   for (int i=1; i<=4; i++)   {
			
			for (int y=1; y<=6; y++) {
				
				if (i==1 || i==4 || y==1 || y==6) {
				   System.out.print("*");
				}else {
				   System.out.print(" ");
			    }
				
		 }
		    System.out.println();
		}
   }
}
