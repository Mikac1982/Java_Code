package com.class6;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
	  // Using scanner class create calculator.
	  // Allow user to enter 2 numbers and operator (+,-,/,*)
	  // Based on operator provide the result to user.
		
	Scanner scan;
	double num1, num2, result = 0;
	char operator;	
	
  scan=new Scanner(System.in);
  
  System.out.println("Please enter two numbers");
  num1=scan.nextDouble();
  num2=scan.nextDouble();
  
  System.out.println("Please enter operation you want to perform");
  operator=scan.next().charAt(0);
  
  switch (operator) {
  
  case '+':
	  result=num1+num2;
	  break;
  case '-':
	  result=num1-num2;
	  break;
  case '*':
	  result=num1*num2;
	  break;
  case '/':
	  result=num1/num2;
	  break;
  default:
	  System.out.println("Unknown operation");
  }
  
System.out.println("The result of this operation is "+result);
  
	}

}
