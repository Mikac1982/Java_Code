package com.class4;

import java.util.Scanner;

public class NestedIfScanner {
	public static void main(String[] args) {

		int age;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");

		age = input.nextInt();

		//System.out.println(age);

		if (age < 16) {
			System.out.println("You are not eligible to work");

		} else {
			System.out.println("You are eligible to work");
		    }if (age<64) {
		    	System.out.println("Go work hard");
		    }else {
		    	System.out.println("You don't need to work, go ejoy your life");
		    }

	}

}
