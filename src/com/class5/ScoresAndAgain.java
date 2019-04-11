package com.class5;

import java.util.Scanner;

public class ScoresAndAgain {
	public static void main(String[] args) {
		//  Write a program that will read 3 inputs of scores(quiz, mid term, final scores)
	    //  Determine the grades based on the following rules;
	    //  if the average score >=90 --> grade=A
	    //  if average score>=70 and <90 --> grade=B
	    //  if average score>=50 and <70 -->grade=C
	    //  if the average score <50 --> grade=F
	    // NOTE: avgScore=(quiz+mid term+final score)/3;
		
	int quiz, midTerm, finalScore, average;	
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your quiz score: ");
	quiz=sc.nextInt();
	System.out.println("Please enter your mid term score: ");
	midTerm=sc.nextInt();
	System.out.println("Please enter your final score: ");
	finalScore=sc.nextInt();
	
	average=(quiz+midTerm+finalScore)/3;
	System.out.println("Your average score is "+average);
		
	if (average>=90)	{
		System.out.println("Your  grade is A");
	}else if (average>=70 && average<90) {
		System.out.println("Your grade is B");
	}else if (average>=50 && average<70) {
		System.out.println("Your garde is C");
	}else if (average<50) {
		System.out.println("Your grade is F");
	}
		
 }

}
