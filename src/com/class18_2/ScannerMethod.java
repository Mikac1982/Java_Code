package com.class18_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj=new ScannerMethod();	
		
		Scanner scan=new Scanner(System.in); //option with Scanner
		int a=scan.nextInt();
		int b=scan.nextInt();
		
	    int c=obj.sum(a, b);
	    System.out.println(c);
	//	System.out.println(obj.sum(a, b)); //same thing
		
	//	obj.sum(14, 16);   //option with dinamic method 
	//	obj.sum(100, 200);
		
	//	obj.sub();    // 8
	//	obj.sub();    // 8
	}
	
	public int sum(int a,int b) {   //DINAMIC METHOD (takes parameters) WITH return value
		
	//	System.out.println(a+b);  
		return a+b;
	}
	
	void sub() {     //does NOT take parameters
		int a=20;
	    int b=12;
		System.out.println(a-b); //always the same	
	}
	
	
	
	
}
