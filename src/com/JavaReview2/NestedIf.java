package com.JavaReview2;

public class NestedIf {
	public static void main(String[] args) {

		// Write a program with 2 boolean values summer and sunny;
		// As a family we go on vacation ONLY when it's the summer time;
		// Once we are on vacation we like to go to the beach ONLY when it's sunny;

		boolean summer = false;
		boolean sunny = true;

		if (summer) {
			System.out.println("We are going on vacation");

			if (sunny) {
				System.out.println("We are going to the beach");

			} else {
				System.out.println("We are staying in a hotel.");
			}

		} else {
			System.out.println("We are not going to vacation");
		}

	}

}
