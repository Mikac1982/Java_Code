package com.class4;

public class MortageRate {

	// declare mortgage rate and mortgage price
	// if rate>4.5 --> not buy a house
	// otherwise-->considering buying
	// if house price>200000 --> user will take a loan
	// otherwise --> will pay cash

	public static void main(String[] args) {

		double mortgRate = 4.3;
		double mortgPrice = 300.000;
		
		if (mortgRate > 4.5) {
			System.out.println("I not buying the house");
		} else {
			System.out.println("I am considering buying the house");
			   if (mortgPrice >200.000) {
				  System.out.println("I will take a loan");  
			 } else {
				System.out.println("I will pay a cash");
			}

		}

	}

}
