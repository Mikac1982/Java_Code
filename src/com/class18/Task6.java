package com.class18;

public class Task6 {
   public static void main(String[] args) {
	
	// 1234567   
	// 1234567   
	// 1234567 
	// 1234567
	   
	   for (int i=1; i<=4; i++) {
		   
		   for (int y=1; y<=7; y++) {
			   System.out.print(y);
		   }
		   System.out.println();
	   }
	  System.out.println();
	  
	// 11111111
	// 22222222
	// 33333333
	// 44444444
	// 55555555
	// 66666666
	   
	   for (int i=1; i<=6; i++) {
		   
		   for (int y=1; y<=8; y++) {
			   System.out.print(i);
		   }
		   System.out.println();
	   }
	   System.out.println();
	   
	// @@@@@@@@@   rows=6; columns=9;
	// @@@@@@@@@
	// @@     @@
	// @@     @@
	// @@@@@@@@@
	// @@@@@@@@@
	   
	   for (int i=1; i<=6; i++)   {
			
			for (int y=1; y<=9; y++) {
				
				if (i==1 || i==2 || i==5 || i==6 || y==1 || y==2 || y==8 || y==9) {
				   System.out.print("@");
				}else {
				   System.out.print(" ");
			    }
				
		 }
		    System.out.println();
		}
		   
}
}
