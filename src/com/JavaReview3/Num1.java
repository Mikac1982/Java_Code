package com.JavaReview3;

import java.util.Scanner;

public class Num1 {
	public static void main(String[] args) {
		// Write a program to find out what to do for the following temperatures
		// if temp>100 print out Stay inside it's too hot
		// if temp >50 and <99 --> Wear summer clothes
		// if temp>30 and temp<49 -->Wear winter clothes
		// if temp>10 and less 29 -->Stay inside it's too cold
		//if temp < than that -->Call for help it's too cold outside

		int temp;
        String output;
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the temperature");
		temp = scan.nextInt();

		if (temp >=100) {
			output="Stay inside it's too hot";
		} else if (temp > 50 && temp <=99) {
			output="Wear summer clothes";
		} else if (temp > 30 && temp <=49) {
			output="Wear winter clothes";
		} else if (temp > 10 && temp <=29) {
			output="Stay inside it's too cold";
		} else {
			output="Call for help it's too cold outside";
		}
		System.out.println(output);
	}

}
