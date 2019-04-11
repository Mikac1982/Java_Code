package com.class4;

import java.util.Scanner;

public class YearsAndSalaryScanner {
	public static void main(String[] args) {
		
		// write a program to ask a user to enter numbers of worked years and annual salary
	    // if user worked for more or equal to 5 y, user is eligible for the bonus
		// otherwise he is not
		// if salary is larger than 50000, he is getting bonus 5000
		// otherwise bonus is 3000
	
	    int years, salary;
	
	    Scanner input=new Scanner(System.in);
	    System.out.println("Please enter number of worked years");
	    years=input.nextInt();
	
	    if (years>=5) {
		    System.out.println("You are getting bonus");
		    System.out.println("What is yor annual salary?");
		    salary=input.nextInt();
		      if (salary>50000) {
			     System.out.println("Your bonus is 5000");
		      }else {
			     System.out.println("Your bonus is 3000");
		 }
		
	    }else {
		  System.out.println("Sorry, you are not getting bonus");
	    }
	
 }

}
