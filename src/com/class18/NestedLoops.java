package com.class18;

public class NestedLoops {
	public static void main(String[] args) {

		NestedLoops obj=new NestedLoops();
		obj.printNum();
		
	}
	
	void printNum() {
		
		for (int i = 0; i < 5; i++) { // i --> counter variable

			for (int y = 0; y < 3; y++) { //
				System.out.println("I am inner loop");
			}
			System.out.println("------I am outer loop--------");
		}

	}
}
