package com.class8;

import java.util.Scanner;

public class Range {
   public static void main(String[] args) {
	
	   //let user define a range of numbers to print
	   
	int startNum, endNum;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter starting number");
	startNum=scan.nextInt();
	System.out.println("Please enter ending number");
	endNum=scan.nextInt();
	
	for (int i=startNum; i<=endNum; i++) {
		System.out.print(i+" ");
	}
	
	   
	   
}
}
