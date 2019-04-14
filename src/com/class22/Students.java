package com.class22;

public class Students {

	/* Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade.
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 * NOTE: please make different names for instance and local variables.
   */
	
	public String studentName;
	int grade1, grade2, grade3;
	
	public Students (String name, int a,int b,int c) {
		studentName=name;
		grade1=a;
		grade2=b;
		grade3=c;
	}
	
	public void getAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("My name is "+studentName+" and my grade is "+average);
		}
		
	
	
	
	

	
}
