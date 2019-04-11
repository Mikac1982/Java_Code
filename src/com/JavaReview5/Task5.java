package com.JavaReview5;

public class Task5 {
	public static void main(String[] args) {

		// Write a program to print following pattern:

		// 1....
		// .2...
		// ..3..
		// ...4.
		// ....5

		for (int i=1; i<=5; i++)  {
			for (int y=1; y<=5; y++) {
				if (y==i) {
					System.out.print(i);
				}else {
					System.out.print(".");
				}
			}
		System.out.println();	
		}
		
		// second way
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=5; y++) {
                if (y!=i) {
					System.out.print(".");
				} else if (y==i) {
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}
}
