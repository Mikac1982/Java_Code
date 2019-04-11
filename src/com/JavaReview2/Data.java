package com.JavaReview2;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {

		String name, gender;
		int age;
		long phoneNum;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = input.nextLine();
		System.out.println("Please enter your gender");
		gender = input.nextLine();
		System.out.println("please enter your age");
		age = input.nextInt();
		System.out.println("Please enter your phone number");
		phoneNum = input.nextLong();

		System.out.println("Name: " + name);
		System.out.println("Gender; " + gender);
		System.out.println("Age: " + age);
		System.out.println("Phone Num: " + phoneNum);
	}

}
