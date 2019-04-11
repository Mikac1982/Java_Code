package com.class9;

import java.util.Scanner;

public class TaskSecretNum {
	public static void main(String[] args) {

		// Write a guessing game where the user has to guess a secret number between 1 and 20
		// After every guess input, the program tells the user whether their number was
		// too large or too small.
		// The program will keep asking the user to enter the number until he finds the correct number.
		// When the correct answer is found the system should display
		// "Congratulations!!. You got it!".

		Scanner scan;
		int secretNum = 13;
		int num;

		scan = new Scanner(System.in);
		System.out.println("Please enter any number between 1 and 20");
		
		do {
	
		// System.out.println("Please enter any number between 1 and 20");
		 num = scan.nextInt();
       
		     if (num>secretNum) {
			     System.out.println("The number you enter is too large, try again");
		     }else if (num<secretNum) {
			     System.out.println("The number you enter is too small, try again");
		     }
		 } while (num!=secretNum);
		
		System.out.println("Congratulations, you got it!");
	}
}
