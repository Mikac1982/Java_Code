package com.class11;

public class Task5 {
   public static void main(String[] args) {
	
	// Create a 2D array that first row will contain 4 names and second row will contain grades.
	// Then you program should print name of the students that has as an A and B grade   
	   
	String[][] student= {
			{"Una","Milica","Dragana","Nata"},
			{"A","B","C","D"}
	};
	
	System.out.println("Students "+student[0][0]+" and "+student[0][3]+" have grade "+student[1][0]);
	System.out.println("Students "+student[0][1]+" and "+student[0][2]+" have grade "+student[1][1]);   
	   
	// second way
	System.out.println();
	
	String[][] students=new String[2][4];
	
	students[0][0]="Una";
	students[0][1]="Milica";
	students[0][2]="Dragana";
	students[0][3]="Nata";
	
	students[1][0]="A";
	students[1][1]="B";
	students[1][2]="C";
	students[1][3]="D";
	
	System.out.println("Student with a "+students[1][0]+" grade is "+students[0][3]);
	System.out.println("Student with a "+students[1][1]+" grade is "+students[0][2]);
	
	
	
	
	
 }
}
