package com.class8;

import java.util.Scanner;

public class Task7Range {
   public static void main(String[] args) {
	
// let user define a range of numbers to print   
	   
	 Scanner scan=new Scanner(System.in);
	 
	 System.out.println("Please enter a starting number");
	 int startNum=scan.nextInt();
	 
	 System.out.println("Please enter ending number");
	 int endNum=scan.nextInt();
	 
	   if (startNum<endNum) {
	 
	       for (int i=startNum; i<=endNum; i++ ) {
		        System.out.print(i+" ");
	       }
       }else {
	          System.out.println("I won't run your code");
          }
		   
}
}
