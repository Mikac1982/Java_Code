package com.class6;

import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
	// Allow user to enter grade and than provide explanation: A-excellent; B-good; C-average; D-bad;
	// any other grade-not acceptable;
	// At the end your program should print which grade was entered by a user with explanation.
	  
	Scanner scan;
	char grade;
	String explan;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your grade");
	grade=scan.next().charAt(0);
	
	switch (grade) {

	case 'A':
		explan="excellent";
		break;
	case'B':
		explan="Good";
		break;
	case 'C':
		explan="Average";
		break;
	case 'D':
		explan="Bad";
		break;
	default:
		explan="Not acceptable";
		
	}
	System.out.println("The "+grade+" grade you entered is "+explan);
	  	  
}
}
