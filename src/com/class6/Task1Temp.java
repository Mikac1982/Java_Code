package com.class6;

import java.util.Scanner;

public class Task1Temp {
	public static void main(String[] args) {
		// Write a program that prints out if it is good weather to go for any activity
		// or not
		// if the temperature is between 40 and 80 degrees inclusive & no rain--> we
		// will go for hiking
		// otherwise--> we will not go hiking
		// if temperature is between 25 and 40 inclusive & snowing--> going snowboarding
		// otherwise we are not going snowboarding
		// if temperature is more than 80 & sunny--> go to the beach
		// otherwise --> not go to the beach
		
	Scanner scan;
	boolean rain, snow, sunny;
	int temp;
	String activity;        //String activity=null; or String activity="";--> if you don't provide a value for each variable!
	                                       // default value of a String is null!
	scan=new Scanner(System.in);
	System.out.println("Please enter a temperature");	
	temp=scan.nextInt();
	
	if (temp>=40 && temp<80) {
		System.out.println("Is it raining?");
		rain=scan.hasNext();
		   if (rain) {
			   activity="watch a movie";		
		   }else {
			   activity="Go hiking";
		   }
	}else if (temp>=25 && temp<40)	{
	    System.out.println("Is it snowing?");
	    snow=scan.hasNext();
	       if (snow) {
	    	activity="snowboarding";
		   }else {
			activity="Do coding";
			}
	}else if (temp>=80) {
		System.out.println("Is it sunny?");
		sunny=scan.hasNext();
		  if (sunny) {
			  activity="Go to the beach";
		  }else {
			  activity="Do more coding";
		  }
	}else {
		System.out.println("Please enter different temperature");
		activity="Unknown";   //we have to assign value for each variable!
	}
	System.out.println("My activity for today is "+activity);
	
	}
			
}

