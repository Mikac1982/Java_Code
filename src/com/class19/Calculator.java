package com.class19;

public class Calculator {
	
    //Create a class called Calculator
	//Have methods that take 3 inputs and return the result
	//and return the sum, average, min and max
	// (call it from another class)
	
	 int sum(int a,int b,int c) {
		
		return (a+b+c);	
	}
	
	 int average(int a,int b, int c) {
		
		return (a+b+c)/3;
	}
	
	 int min(int a,int b, int c) {
		int min=a;
		
		if (b<a) {
		   min=b;
	    }
		if (c<min) {
			min=b;
		}
		return min;
	}
	
	static int max(int a,int b,int c) {
		int max=a;
		if (b>a) {
			   max=b;
		    }
			if (c>max){
				max=b;
			}
		return max;
	}
	
	//continue with application3
	
}
