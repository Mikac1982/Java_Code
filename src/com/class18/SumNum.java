package com.class18;

import java.util.Scanner;

public class SumNum {
	public static void main(String[] args) {

		// Write a program that reads a range of integers (start and end point),
		// provided by a user.
		// and then from that range prints the sum of the even and odd integers

		Scanner scan;
		int startNum, endNum;
		int sum1 = 0;
		int sum2 = 0;

		scan = new Scanner(System.in);
		System.out.println("Please enter starting number");
		startNum = scan.nextInt();
		System.out.println("Please enter ending number");
		endNum = scan.nextInt();

		if (startNum<endNum) {
			
		for (int i = startNum; i <= endNum; i++) {

			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else if (i % 2 != 0) {
				sum2 = sum2 + i;
			}
			
		}
		System.out.println("The sum of even numbers is " + sum1);
		System.out.println("The sum of odd numbers is " + sum2);
		}
	}
}
