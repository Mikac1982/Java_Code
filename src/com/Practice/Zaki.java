package com.Practice;

import java.util.Scanner;

public class Zaki {
	public static void main(String[] args) {
		
		//Write a program that asks the user to enter the name of his or her favorite city.
		  // Use a String variable to store the input. 
		  // The program should display the following: 
		   //• The number of characters in the city name 
		   //• The name of the city in all uppercase letters 
		   //• The name of the city in all lowercase letters 
		   //• The first character in the name of the city   
		
		String city;
		   
		Scanner scan=new Scanner(System.in);   
		System.out.println("Please enter your favorite city"); 
		city=scan.nextLine();
		
		for (int i=0; i<city.length(); i++) {
			
		}
		System.out.println(city.length());   
		System.out.println(city.toUpperCase());   
		System.out.println(city.toLowerCase());   
		System.out.println(city.charAt(0));  
		   
	}
}
