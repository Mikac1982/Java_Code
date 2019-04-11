package com.class8;

import java.util.Scanner;

public class ForAndScannerAgain {
   public static void main(String[] args) {

	// Prompt user to enter 2 integers 5 times and compare them
	// At the end print largest

  Scanner scan; 
  int num1, num2;
  
  scan=new Scanner (System.in);
  
  for (int i=1; i<=5; i++) {
	  
    System.out.println("Please enter two numbers");
    num1=scan.nextInt();
    num2=scan.nextInt();
  
       if (num1>num2) {
    	   System.out.println(num1+" is the largest");
       }else if (num2>num1) {
    	   System.out.println(num2+" is the largest");
       }else {
    	   System.out.println(num1+" is equal to "+num2);
       }
  
	   
  }   
 } 
}
