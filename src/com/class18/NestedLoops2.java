package com.class18;

public class NestedLoops2 {
	public static void main(String[] args) {

	//	 for (int i=0; i<=5; i++) {

	//	 System.out.print(i);
	//	 }

	NestedLoops2 obj=new NestedLoops2();
		obj.printpater();
	    obj.printPatern2();
		
	}
	
	void printpater() {
		// I want to print pattern:
				// 123456789 --> 5 rows and columns=9
				// 123456789
				// 123456789
				// 123456789
				// 123456789

				for (int i = 1; i <= 5; i++) { // rows

					for (int y = 1; y <= 9; y++) { // columns

						System.out.print(y); // 123456789
					}
					System.out.println(); // creates new line
				}
				System.out.println();	
	}

	void printPatern2() {
		// I want to print pattern:
				// 1111111 7 columns 7 rows
				// 2222222
				// 3333333
				// 4444444
				// 5555555
				// 6666666
				// 7777777

				for (int i = 1; i <= 7; i++) {

					for (int y = 1; y <= 7; y++) {
						System.out.print(i); // 1111111 //2222222 //3333333
					}
					System.out.println();
				}

		
	}
}
