package com.class9;

public class Task4 {
	public static void main(String[] args) {

		// Print the following pattern:
		// 1
		// 12
		// 123
		// 1234
		// 12345

		for (int i=1; i<=5; i++) { // outer loop controls how many times inner loop will be executed

			for (int y=1; y<=i; y++) { // first entire inner loop has to be finished before jumping to outer loop
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println();

		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1
		
		for (int i = 5; i >= 1; i--) {

			for (int y = 1; y <= i; y++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
