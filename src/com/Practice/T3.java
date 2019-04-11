package com.Practice;

public class T3 {
   public static void main(String[] args) {
	 
	//      1
	//     222
	//    33333
	//   4444444
	//  555555555 
	   
	for (int i=1; i<=5; i++)   {
		for (int y=1; y<=5-i; y++)  {
			System.out.print(" ");
		}
		for (int y=1; y<(i*3)-i; y++) {
			System.out.print(i);
		}
		System.out.println();
	}
	  System.out.println(); 
	  
	//      1
	//     123  
	//    12345  
	//   1234567  
	//  123456789  
	  
	for (int i=1; i<=5; i++)  {
		for (int y=1; y<=5-i; y++) {
			System.out.print(" ");
		}
		for (int y=1; y<(i*3)-i; y++) {
			System.out.print(y);
		}
		System.out.println();
	}
	 System.out.println();
	 
	//       9
	//      987 
	//     98765 
	//    9876543 
	//   987654321  
	 
	for (int i=1; i<=5; i++) { 
		for (int y=1; y<=5-i; y++) {
			System.out.print(" ");
		}
		for (int y=1; y<(i*3)-i; y++) {   //  ?????????
		
			System.out.println();
			}
		}
		System.out.println();
	
}
}
