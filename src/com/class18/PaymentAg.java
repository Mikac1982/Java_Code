package com.class18;

import java.util.Scanner;

public class PaymentAg {
	public static void main(String[] args) {

		// Ask user to enter the item they want to buy and the price for the item.
		// Then ask user to pay for it.
		// Every time user enters money accumulate the amount and tell user how much is
		// left to pay off the amount.
		// Whenever user done with payments tell them "Thank you for shopping!"

		String item;
		double price, payment, extraAm;
		double totalPayment = 0;
		double balance, change;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a item you want to buy");
		item = scan.nextLine();
		System.out.println("Please enter te price of a item");
		price = scan.nextDouble();

		do {
			System.out.println("Please enter your payment amount");
			payment = scan.nextDouble();

			totalPayment = totalPayment + payment;
			balance = price - totalPayment;

			if (totalPayment > price) {
				change = totalPayment - price;
				System.out.println("Please take your change " + change);
				break;
				
			} else if (totalPayment < price) {
				balance = price - totalPayment;
				System.out.println("Please enter more $ " + balance);
				
			}
		} while (totalPayment != price);
		System.out.println("Thank you for shopping!");

	}
}
