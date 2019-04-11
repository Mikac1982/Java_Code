package com.class4;

public class MotageRate1 {

	public static void main(String[] args) {
		// store variables to store mortgage rate and morgage price
		// if rate>4.5 -->not buying house
		// otherwise will consider buying
		// if price>200000 -->user will take a loan
		// otherwise --> will pay cash

		double rate = 4.3;
		double price = 130000;
		double expRate = 4.5;
		double expPrice = 200000;

		if (rate > expRate) {
			System.out.println("I am not buying house");

		} else {
			System.out.println("I will consider buying a house");
			if (price > expPrice) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}
		}
	}

}
