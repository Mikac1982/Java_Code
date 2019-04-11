package com.JavaReview3;

import java.util.Scanner;

public class UserExperience {
	public static void main(String[] args) {
	// Write a program to found out the user level of experience
    // Must use a switch statement with  a String variable named levelString and a int variable named level
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
		
	String levelString;
 // int level=3;
	int level;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your level of experience");
	level=scan.nextInt();
	
	switch (level) {
	case 1:
		levelString="Beginner";
		break;
	case 2:
		levelString="Intermediate";
		break;
	case 3:
		levelString="Expert";
		break;
	default:
		levelString="Unknown";
		
	 }
		
	System.out.println("User level of experiance is "+levelString);	
	}

}
