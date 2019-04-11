package com.JavaReview7;

import java.util.Scanner;

public class ReviewClass {

	String eyes, hair, nose, shirt;  //GLOBAL VARIABLE (ATTRIBUTTES)
	
	public static void main(String[] args) {
		
		String ear="left";
	     //LOCAL VARIABLE
		ReviewClass weqas=new ReviewClass();
//		weqas.eyes="blue";
//		weqas.hair="black";
//		weqas.nose="brown";
//		weqas.shirt="gray";
//		weqas.humanEyes();
//		
//		ReviewClass weqas1=new ReviewClass();  //new object
//		weqas1.eyes="green";                   //with new variable
//		
//		System.out.println(weqas1.eyes);
		weqas.scannerFirstName();   // i call
		weqas.noReturn();         // 
		weqas.scannerInt();   // CALLING THE METHOD
		
	}
	void humanEyes() {    
		ReviewClass weqas=new ReviewClass();
		weqas.eyes="red";
		System.out.println(weqas.eyes);
	}
	void noReturn() {
		System.out.println("I do not have a return type");
	}
	void scannerFirstName() {
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
	}
	void scannerInt() {
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
	}
	
	
}
