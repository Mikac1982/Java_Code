package com.JavaReview3;

import java.util.Scanner;

public class DaysSwitch {
	public static void main(String[] args) {
   // Write a program that will use a switch statement to display what day of the week and also the weekend
		
	//	int=5;
		
		int day;
		String dayName;
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a day number");
        day=scan.nextInt();
        
		switch (day) {

		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wensday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";

		}
System.out.println("Today is "+dayName);
	}

}
