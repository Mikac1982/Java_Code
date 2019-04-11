package com.Practice;

public class NestedLoops {
  public static void main(String[] args) {
	
	 for (int i=1; i<=9; i++)  {
		 System.out.print(i);
	 }
	 System.out.println();
	 System.out.println();
	 
	// I want to print pattern   
	// 123456789 
	// 123456789
	// 123456789
	// 123456789
	 
	 for (int i=1; i<=4; i++) {
		 for (int y=1; y<=9; y++) {  // 123456789
			 System.out.print(y);
		 }
		 System.out.println();    // create new line 
	 }
	 System.out.println();
	 
	// I want to print pattern:
			// 11111111   7=rows 8=columns
			// 22222222
			// 33333333
			// 44444444
			// 55555555
			// 66666666
			// 77777777
	 
	 for (int i=1; i<=7; i++) {
		 for (int y=1; y<=8; y++) {
			 System.out.print(i);  // 11111111; 22222222; 33333333; 444444444; 55555555; 66666666; 77777777;
			  }
		 System.out.println();
	 }
}
}
