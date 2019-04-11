package com.class6;

import java.util.Scanner;

public class Activity {
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
   String activity;
   
   scan=new Scanner(System.in);
   System.out.println("Please enter thetemperature");
   temp=scan.nextInt();
   
   if (temp>=40 && temp<80) {
	   System.out.println("Is it raining?");
	   rain=scan.nextBoolean();
	   if (rain) { 
		   activity="watch movie";
	   }else {
		   activity="go hiking";
	 }
   }else if (temp>=25 && temp<40) {
	   System.out.println("Is it snowing?");
	   snow=scan.nextBoolean();
	   if (snow) {
		   activity="go snowboarding";
	   }else {
		   activity="do coding";
	   }
   }else if (temp>80) {
	   System.out.println("Is it sunny?");
	   sunny=scan.nextBoolean();
	   if (sunny) {
		   activity="go to the beach";
	   }else {
		   activity="do more coding";
	   }
   }else {
	   System.out.println("Please enter diiferent temperature");;
	   activity="unknown";
   }
   System.out.println("Your activity for today: "+activity);
   
      }   
   	
	}
 

