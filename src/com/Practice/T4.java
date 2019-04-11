package com.Practice;

public class T4 {
   public static void main(String[] args) {
	
    //	   1
	//    212
	//   32123
	//  4321234
	// 543212345

	 for (int i=1; i<=5; i++)  {
		 for (int y=1; y<=5-i; y++)  {
			 System.out.print(" ");
		 }
		 for (int y=1; y<(i*3)-i; y++) {
			if (y==i) {
				 System.out.print(1);
			}else if (i>y) {
				System.out.print(i-y+1);
			}else if (y>i) {
				System.out.print(y-i+1);
			}
			 
		 }
		 System.out.println();
	 }
	      
  }
}
