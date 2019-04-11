package com.class5;

import java.util.Scanner;

public class ScoresAnd {
	public static void main(String[] args) {
      /* Write a program that will read 3 inputs of scores(quiz, mid term, final scores)
       * Determine the grades based on the following rules;
       *  if the average score >=90 -->grade=A
       *  if average score>=70 and <90--> grade=B
       *  if average score>=50 and <70 -->grade=c
       *  if the average score <50 --> gradeF
       * NOTE: avgScore=(quiz+mid term+final score)/3;
       */
	int quiz, midTerm, finalScore, avgScore;  // declaring the variables;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter you quize score");	
	quiz=input.nextInt();
	
	System.out.println("Please enter your mid term score");
	midTerm=input.nextInt()	;
	
	System.out.println("Please enter your final score");
	finalScore=input.nextInt();
	
	avgScore=(quiz+midTerm+finalScore)/3;
	System.out.println("Your averige score is "+avgScore);
	
	if (avgScore>=90) {
		System.out.println("Your grade is A");
	}else if (avgScore>=70 && avgScore<90) {
		System.out.println("Your grade is B");
	}else if (avgScore>=50 && avgScore<70) {
		System.out.println("Your grade is C");
	}else if (avgScore<50){
		System.out.println("Your grade is F");
	}
	}

}
