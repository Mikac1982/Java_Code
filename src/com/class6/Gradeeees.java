package com.class6;

import java.util.Scanner;

public class Gradeeees {
	// Allow user to enter grade and than provide explanation: A-excellent; B-good; C-average; D-bad;
	// any other grade-not acceptable;
	// At the end your program should print which grade was entered by a user with explanation.
	public static void main(String[] args) {
		
	Scanner scan;
	char grade;
	String explan;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your grade");
	grade=scan.next().charAt(0);
	
	switch (grade) {
	
	case 'A':
	    explan="excellent"	;
	    break;
	case 'B':
		explan="good";
		break;
	case 'C':
		explan="average";break;
	case 'D':
		explan="bad";
		break;
	default:
		explan="not acceptable";
	}
	System.out.println("User entered a grade "+grade+" which is "+explan);	
	}	
}
