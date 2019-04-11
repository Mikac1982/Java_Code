package com.class4;

import java.util.Scanner;

public class Loan1 {
	public static void main(String[] args) {

		int loan;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the needed amount of loan");

		loan = input.nextInt();

		if (loan < 200.000) {
			System.out.println("Lend the money");

		} else {
			System.out.println("Reject the client");
		}

	}

}
