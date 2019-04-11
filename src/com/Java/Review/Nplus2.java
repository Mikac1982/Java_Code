package com.Java.Review;

public class Nplus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "John";
		String lastName = "Janner";
		char middleInitials = 'D';
		String city = "Washington";
		String state = "DC";
		int zipCode = 20009;
		long phoneNumber = 571342566;

	    System.out.println(firstName);
		System.out.println(lastName);
//		System.out.println(middleInitials);
//		System.out.println(city);
//		System.out.println(state);
//		System.out.println(zipCode);
//		System.out.println(phoneNumber);

		// sortcut to print in new lines (easier way is this, shorter):
//		System.out.println("\n" + firstName + "\n" + lastName + "\n" + middleInitials + "\n" + city + "\n" + state+ "\n" + zipCode + "\n" + phoneNumber);

		System.out.println("\n " + firstName + " " + lastName + "\n " + middleInitials + "\n " + city + " " + state+ " " + zipCode + "\n " + phoneNumber);

		   // 2 different ways of printing in the same line:
//		System.out.println(firstName+" "+lastName);
		
//		System.out.print(firstName);
//		System.out.print(" "+lastName);
	}   

}
