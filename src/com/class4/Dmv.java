package com.class4;

import java.util.Scanner;

public class Dmv {
	public static void main(String[] args) {

		int age;

		Scanner input = new Scanner(System.in);

		System.out.println("How old are you?");
		age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are getting your driver licence");

		} else {
			System.out.println("You can get a learners permit");
		}

	}

}
