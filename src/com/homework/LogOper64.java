package com.homework;

import java.util.Scanner;

public class LogOper64 {
  public static void main(String[] args) {
	/* Prompt user to: "Please enter your birthday month number" 
	/    if user enters 12, 1, 2 --> season="Winter"
	/	 if user enters 3, 4, 5--> season="Spring"
	/	 if user enters 6, 7, 8 --> season="Summer"
	/	 if user enters 9, 10, 11--> season="Fall"
	/	 if any other number--> "Please enter valid month number" and season="Unknown"
    /  The output of the program should be :   You were born in __ "  
	 */
		
	  Scanner scan;
	  String season;
	  int monthNum;
	  
	  scan=new Scanner(System.in);
	  System.out.println("Please enter your birthday month number");
	  monthNum=scan.nextInt();
	  
	  switch (monthNum) {
	  
	  case 12:
	  season="Winter";
	  break;
	  case 1:
		  season="Winter";
		  break;
	  case 2:
		  season="Winter";
		  break;
	  case 3:
		  season="Spring";
		  break;
	  case 4:
		  season="Spring";
		  break;
	  case 5:
		  season="Spring";
		  break;
	  case 6:
		  season="Summer";
		  break;
	  case 7:
		  season="Summer";
		  break;
	  case 8:
		  season="Summer";
		  break;
	  case 9:
		  season="Fall";
		  break;
	  case 10:
		  season="Fall";
		  break;
	  case 11:
		  season="Fall";
	  default:
		  season="Unknown";
	  }
	  System.out.println("You were born in "+season);
}
}
