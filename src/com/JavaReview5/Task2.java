package com.JavaReview5;

public class Task2 {
	public static void main(String[] args) {

		// ....1 rows=5 columns=5
		// ...22
		// ..333
		// .4444
		// 55555

	    // 1 to 5
	    // 1 to 5-i
	    // 1 to i
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y <=5-i; y++) {
				System.out.print(".");
			}
			for (int y=1; y<=i; y++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
	// second way	
		
		for (int i=1; i<=5; i++) {
			for (int y=5; y>=1; y--)  {
				if (y>i) {
					System.out.print(".");
				}else  {
					System.out.print(i);
				}
			    }
				System.out.println();
			}
		
		
		
	}
}
