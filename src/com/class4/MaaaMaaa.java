package com.class4;

import java.util.Scanner;

public class MaaaMaaa {
	public static void main(String[] args) {

		// write a program to ask a user to enter numbers of worked years and annual
		// salary.
		// if user worked for more or equal to 5 y, user is eligible for the bonus
		// otherwise he is not
		// if salary is larger than 50000, he is getting bonus 5000
		// otherwise bonus is 3000

		int years, salary;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enyer years you worked");
		years = input.nextInt();

		if (years >= 5) {
			System.out.println("You are eligible for bonus");
			System.out.println("Please enter your annual salary");
			salary = input.nextInt();

			if (salary > 5000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}

		} else {
			System.out.println("You are not gtting bonus");
		}

	}

}
