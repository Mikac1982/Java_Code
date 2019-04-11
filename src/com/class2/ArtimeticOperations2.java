package com.class2;

public class ArtimeticOperations2 {

	public static void main(String[] args) {

		// Task 1

		double a = 30.5555555;
		double b = 15.1111111;

		double sum = a + b;
		double sub = a - b;
		double mult = a * b;
		double div = a / b;

		System.out.println("The addition of 2 numbers is " + sum + ".");
		System.out.println("The substraction of 2 numbers is " + sub + ".");
		System.out.println("The multiplitacion of 2 numbers is " + mult + ".");
		System.out.println("The division of 2 numbers is " + div + ".");

		// Task 2

		float f = 3.9f;
		float squar = f * f; // 3.9*3.9=15.210001;

		System.out.println("The squar of the 3.9 is " + squar);

		// Task 3

		int w = 5; // width of rectangle
		int h = 8; // height of rectangle

		int area = w * h; // 5*8=40;
		int per = 2 * (w + h); // 2*(5+8)=26;

		System.out.println(
				"The perimeter of a rectangle with width " + w + " and height " + h + " is equal to " + per + ".");
		System.out
				.println("The area of a rectangle with width " + w + " and heihgt " + h + " is equal to " + area + ".");

	}

}
