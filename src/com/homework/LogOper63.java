package com.homework;

import java.util.Scanner;

public class LogOper63 {
public static void main(String[] args) {
	/*  Prompt user to input two strings : "Please enter two strings"
	/	and two integers: "Please enter two numbers"  
	/	and make the comparisons:
	/	if int1 and int2 are equal and word1 and word2 are equal, output "AND"
	/	if int1 and int2 are equal or word1 and word2 are equal, output "OR"
	/	if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
    */
	
	Scanner scan;
	String word1, word2, output = null;
	int int1, int2;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter two strings");
    word1=scan.nextLine();
    word2=scan.nextLine();
    System.out.println("Please enter two integers");
	int1=scan.nextInt();
	int2=scan.nextInt();
	
	if (int1==int2 && word1.equals(word2)) {
		output="AND";
	}else if (int1==int2 || word1.contentEquals(word2)) {
		output="OR";
	}else if (int1!=int2 && !word1.contentEquals(word2)) {
		output="NONE";
	}
	System.out.println("The output is "+output);
}
}
