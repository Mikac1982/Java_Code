package com.class5;

import java.util.Scanner;

public class ConditionsAll1 {
	public static void main(String[] args) {
		// Ask user to enter price and boolean value for sale
		// Based on the sale, we will check the price;
		// if price is <20 --> apply discount 20% and give final price
		// if price>20 less 100 --> apply discount 30% and give final price if price>100
		// if price>100 less 500 --> apply discount 50% and give final price

		boolean sale;
		double price, finalPrice, discount;

		Scanner scann = new Scanner(System.in);
		System.out.println("Please enter if there is a sale: true or false");
		sale = scann.nextBoolean();

		if (sale) {
			System.out.println("Let's check discounts");

			System.out.println("Please enter price");
			price = scann.nextDouble();

			if (price < 20) {
				discount = 20;
				finalPrice = price - (price * 0.2);
			} else if (price >= 20 && price < 100) {
				discount = 30;
				finalPrice = price - (price * 0.3);
			} else if (price > +100 && price < 500) {
				discount = 50;
				finalPrice = price - (price * 0.5);
			} else {
				discount = 75;
				finalPrice = price - (price * 0.75);
			}
          
			System.out.println("Final price is "+finalPrice);
            
		} else {
			System.out.println("Not interested");
		}

	}

}
