package com.class11;

public class SumAllElements {
  public static void main(String[] args) {
	
	// Create an array on integers and calculate the sum of all elements in an array.   
	  
	int[] numbers= {5,9,12,4,10,33,19,4};
	int sum1=0;
	int sum2=0;
	
	for (int i=0; i<numbers.length; i++)  {
		sum1=sum1+numbers[i];
	}
	System.out.println("The sum of all array elements is "+sum1);  
	  
	// second way--> for each loop
	
	for (int num:numbers)  {
		sum2=sum2+num;
	}
	System.out.println("The sum of all array elements is "+sum2);
}
}
