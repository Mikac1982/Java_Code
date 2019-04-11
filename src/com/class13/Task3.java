package com.class13;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		// Write a program that reads two people’s first names and if they expecting boy or girl? 
	    // Based on the input suggests a name for a baby:
		//  Example Output:
		//	  Mom’s first name? Mary
		//	  Dad’s first name? Daniel
		//	  Boy or Girl? boy
		//	  Suggested baby name: DANRY

		//	  Example Output:
		//	  Mom’s first name? Mary
		//	  Dad’s first name? Daniel
		//	  Boy or Girl? girl
		//	  Suggested baby name: MAIEL  
		  
		String momName, dadName,gender,babyName = null;
		
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter mother's names");
		  momName=scan.nextLine();
		  System.out.println("Please enter father's names");
		  dadName=scan.nextLine();
		  
		  System.out.println("Are they expecting a boy or a girl?");
		  gender=scan.nextLine();
		  
		  if (gender.equalsIgnoreCase("boy")) {
			  babyName=dadName.substring(0,dadName.length()/2)+momName.substring(momName.length()/2);
		  }else if (gender.equalsIgnoreCase("girl")) {
			  babyName=momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2);
		  }	else {
			  babyName="No suggestion";
		  }
		  System.out.println(babyName.toUpperCase());
	   }
}
