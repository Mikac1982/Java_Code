package com.class20;

public class Student {

	public static void main(String[] args) {
	//Create a class Student that will have a method getGrade
	//your method should accept the score of a student and return a grade
	//score >90 -A
	//score >80 -B
	//score >70 -C
	//score >60 -D
	//anything else -F
			
	Student obj=new Student();
		
	char myGrade=obj.getGrade(91); //whatever value you will be passing here, that input comes to parameter(has to MATCH)
	System.out.println("My grade at Syntax is "+myGrade);
	
	}
	
	char getGrade(int score) {
	  char grade;
	  
	  if (score>90) {
		  grade='A';
		  
	  }else if (score>80) {
		  grade='B';
		  
	  }else if (score>70) {
		  grade='C';
	  	  
	  }else if (score>60) {
		  grade='D';
		  
	  }else {
		  grade='F';
	  }
	return grade;	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
