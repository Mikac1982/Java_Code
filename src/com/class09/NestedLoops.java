package com.class09;

public class NestedLoops {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { // i --> counter variable

			for (int y = 0; y < 3; y++) { //
				System.out.println("I am inner loop");
			}
			System.out.println("------I am outer loop--------");
		}

	}
}
