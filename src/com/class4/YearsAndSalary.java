package com.class4;

public class YearsAndSalary {

	public static void main(String[] args) {

		// write a program to ask a user to enter numbers of worked years and annual
		// salary.
		// if user worked for more or equal to 5 y, user is eligible for the bonus
		// otherwise he is not
		// if salary is larger than 50000, he is getting bonus 5000
		// otherwise bonus is 3000

		int years = 6;
		int salary = 60000;
		int expYears = 5;
		int expSalary = 50000;

		if (years >= expYears) {
			System.out.println("Eligible for bonus");
			if (salary>expSalary) {
				System.out.println("Bonus is 5000");
				
			}else {
				System.out.println("Bonus is 3000");
			}
		} else {
			System.out.println("Not eligible for a bonus");

		}
	}

}
