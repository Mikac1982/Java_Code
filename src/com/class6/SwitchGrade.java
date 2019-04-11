package com.class6;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
	
	Scanner scan;
	String grade;
	String student;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your grade");
	grade=scan.nextLine();
	
	switch (grade) {
	case "A":
		student="Excelent";
		break;
	case "B":
		student="Good";
		break;
	case "C":
		student="Average";
		break;
	case "D":
		student="Bad";
		break;
	default:
		student="Not acceptable";
		break;
	
	}
	
		
	System.out.println("You enterd grade "+grade+" which is "+student);	
		

	}

}
