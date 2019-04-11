package com.class6;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		// Write a program that prints out if it is good weather to go for any activity or not
	    // if the temperature is between 40 and 80 degrees inclusive & no rain--> we will go for hiking
		// otherwise--> we will not go hiking
		// if temperature is between 25 and 40 inclusive & snowing--> going snowboarding
		// otherwise we are not going snowboarding
		// if temperature is more than 80 & sunny--> go to the beach
		// otherwise --> not go to the beach
	
	Scanner scan;
	int temp;	
	boolean rain, snow, sunny;	
		
	scan=new Scanner(System.in);
	System.out.println("Please enter temperature");	
	temp=scan.nextInt();
	
	if (temp>=40 && temp<80) {
		System.out.println("Is it raining?");
		rain=scan.nextBoolean();
		if (rain) {
			System.out.println("Stay at home");
		}else {
			System.out.println("Go hiking");
		}
	}else if (temp>=25 && temp<40) {
		System.out.println("Is it snowing?");
		snow=scan.nextBoolean();
		if (snow) {
			System.out.println("Go snowboarding");
		}else {
			System.out.println("Do coding");
		}
	}else if (temp>=80) {
		System.out.println("Is it sunny?");
		sunny=scan.nextBoolean();
		if (sunny)  {
			System.out.println("Go to the beach");
		}else {
			System.out.println("Do more coding");
		}
	}else {
		System.out.println("Please enter different temperature");
		
		
			
	}	
		
		
		
	}

}
