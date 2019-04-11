package com.class11;

public class Task3 {
   public static void main(String[] args) {
	
	 // Create an array on integers and calculate the sum of all elements in an array.  
	   
	int[] num= {2,4,6,8,10,12};
	int sum=0;
	
	for (int i=0; i<num.length;i++ ) {
		sum=sum+num[i];
	}
	System.out.println("The sum of all array elements is "+sum);   
	
	// second way
	
	int sum1=0;
	for (int numbers:num) {
		sum1=sum1+numbers;
	}
	System.out.println("The sum of all array elements is "+sum1);
	
}
}
