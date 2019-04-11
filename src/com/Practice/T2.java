package com.Practice;

public class T2 {
	public static void main(String[] args) {

		//     * 
		//    ***
		//   *****
		//  *******
		// *********

   // 1 to 5
   // 1 to 5-i
   // 1 to (i*3)-1	
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=(5-i); y++) {
				System.out.print(" ");
			}
			for (int y=1; y<((i*3)-i); y++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
