package com.class11;

public class LargestSmallestNum {
  public static void main(String[] args) {
	
	// create an array of integers and find largest number and smallest	  
	 
	int[] num= {23,5,66,84,31,26,885,3,11,59};
	int largest=num[0];
	int smallest=num[0];
	
	// first way --> for loop
	for (int i=0; i<num.length; i++)  {
		
		if (num[i]>largest) {
			largest=num[i];
		}else if (num[i]<smallest) {
			smallest=num[i];
		}
	}
	  
	System.out.println("The largest number is "+largest);  
	System.out.println("The smallest number is "+smallest);  
	  
	// second way --> for each loop
	for (int numbers:num) {
		
		if (numbers>largest) {
			largest=numbers;
		}else if (numbers<smallest) {
			smallest=numbers;
		}
	}
	System.out.println("The largest numbers is "+largest);  
	System.out.println("The smallest number is "+smallest);  
	  
  
	  
  }
}
