package com.class4;

public class NestIfAgain2 {
	
	/*
	 * declare variable for gpa and having a diploma
	 * if user has a diploma --> congratulations --> if gpa is higher than 3.5 --> hire person
	 *                                               else --> do not hire
	 */    
	public static void main(String[] args) {
		
		double gpa=3.7;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations"); 
			if (gpa>expectedGpa) {
				System.out.println("Yo are hired");
			}else {
		         System.out.println("Unfortunatly you are not hired");
			}
		}else {
			System.out.println("Go get your degree");
		}
		
		
	
		
		}	
		
}

