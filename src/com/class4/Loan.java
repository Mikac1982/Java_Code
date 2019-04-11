package com.class4;

import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {

		int loan;

		Scanner scann = new Scanner(System.in);
		System.out.println("Please enter the loan amount");

		loan = scann.nextInt();

		if (loan < 200000) {
			System.out.println("Congrats, you will get the loan");

		} else {
			System.out.println("Unfortunaly, you are rejected");
		}

	}
}
