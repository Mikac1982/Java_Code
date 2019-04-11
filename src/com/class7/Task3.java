package com.class7;

public class Task3 {
	public static void main(String[] args) {
		// create a boolean variable workDay and assign true
		// create variable int day and assign it to 1
		// as long as condition is true --> "I need a day off " and increment day
		// once day become 6 --> your condition for your loop should become
		// false

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			
		//	System.out.println("I need a day off ");
				
			 if (day==6) {
				 System.out.println("I don't need a day off");
				 workDay=false;
			 }else {
				 System.out.println("I need a day off");
			 }
			 day++;  
			
	}
	}		
}
