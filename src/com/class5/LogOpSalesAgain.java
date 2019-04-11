package com.class5;

import java.util.Scanner;

public class LogOpSalesAgain {
	public static void main(String[] args) {
		// Write a java program to ask user to enter daily sales amount
		// Based on the sales range commission will be different;
		// Example:/ sale is <100 commission =2
		// sales more than 100 and less than 200 -->5

		int sale, commission;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your sale amount");
		sale = sc.nextInt();

		if (sale > 0 && sale <= 100) {
			commission = 2;

		} else if (sale > 100 && sale <= 200) {
			commission = 5;

		} else if (sale > 200 && sale <= 500) {
			commission = 10;
		} else if (sale > 500) {
			commission = 20;
		} else {
			commission = 0;
		}
    System.out.println("Your commission is "+commission);
	}
}
