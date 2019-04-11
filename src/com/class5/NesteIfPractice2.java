package com.class5;

import java.util.Scanner;

public class NesteIfPractice2 {
	public static void main(String[] args) {
		// check if user has credit card-->
		// check what is the balance:
		// if balance is more than 1000 -->pay off immediately
		// else "you are good"

		boolean creditCard =true;
		int balance = 900;

		if (creditCard) {
			System.out.println("Let's check the balance");
			if (balance >=1000) {
				System.out.println("Pay off immediatly");
		//	} else if (balance==0) {
		//		System.out.println("use your card");
			} else {
				System.out.println("You are good");
			}

		} else {
			System.out.println("Do you want a credit card?");
		}

	}

}
