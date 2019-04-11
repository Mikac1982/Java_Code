package com.Practice;

public class Task5 {
	public static void main(String[] args) {

		// ....1
		// ...2
		// ..3
		// .4
		// 5

		for (int i=1; i<=5; i++) {
			for (int y=1; y<=(5-i); y++) {
					System.out.print(".");
				}
				System.out.println(i);
			}
		System.out.println();
		
		// ....5
		// ...4
		// ..3
		// .2
		// 1
		
		for (int i=5; i>=1; i--)  {           
			for (int y=5; y>(6-i); y--)  {    // ????????????//
				System.out.print(".");
			}
			System.out.println(i);
		}
		
	}
}
