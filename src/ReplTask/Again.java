package ReplTask;

import java.util.Scanner;

public class Again {
public static void main(String[] args) {
	
	// Note: Create a main Method and Scanner class
	   
		// Given a String banana do the following:
		// Print out the following: "The first 3 letters of ___ is ___"
	    // For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"

	String banana;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your value of string banana");
	banana=scan.nextLine();
	
	for (int i=0; i<banana.length(); i++)  {
		
		
	}
	
	System.out.println("The first 3 letters of "+banana+" is "+banana.substring(0, 3));
	
			
 }
}
