package com.homework;

import java.util.Scanner;

public class LogOper61 {
public static void main(String[] args) {
	// Prompt user with question: "Is it weekend?"
	// if it is not a weekend --> subject="Manual testing"
	// Otherwise --> subject="Java"
	// Output of the program should be: "Today you will be learning ____"
	
	Scanner scan;
	boolean weekend;
	String subject;
	
	scan=new Scanner(System.in);
	System.out.println("Is it weekend?");
	weekend=scan.nextBoolean();
	
	if (weekend) {
		subject="Java";
	}else {
		subject="Manual Testing";
	}
	
	System.out.println("Today you will be learning "+subject);
}
}
