package com.class5;

import java.util.Scanner;

public class LogOpSales {
	public static void main(String[] args) {
		// Write a java program to ask user to enter daily sales amount
		// Based on the sales range commission will be different;
		// Example:/ sale is <100 commission =2
		// sales more than 100 and less than 200 -->5
        // sales more than 200 and less than 500 -->10
		// sales more than 500 --> commission=20
		
		Scanner input;
		int sales, commission;

		input = new Scanner(System.in);           
		System.out.println("Please enter sales amount");
		sales = input.nextInt();                          // we scan user input

		if (sales>0 && sales <100) {
			 commission=2;  // we are assigning the value to variable; ?
		} else if (sales >=100 && sales < 200) {
			 commission=5;
		} else if (sales>=200 && sales<500) {
			 commission=10;
		}else if (sales>=500) {
			 commission=20;
		}else {
			 commission=0;
		}

		
		System.out.println("Your comission is "+commission);
	}

}
