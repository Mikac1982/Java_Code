package com.class26Again;

public class ThisKeyword {
       //10    20
	int num1, num2;  //intsance variables
	
	public ThisKeyword() {
		System.out.println("No parameters here");
	}
	
	public ThisKeyword(int num1, int num2) {//local variables
		this.num1=num1;
		this.num2=num2;
	}
	                  //local variables
	public void sum(int num1, int num2) {               //100+200
		System.out.println("The sum of LOCAL variables="+(num1+num2)); //300
		                                                      // 10   +   20
		System.out.println("The sum of INSTANCE variables="+(this.num1+this.num2)); //30
	}
	
	
}
