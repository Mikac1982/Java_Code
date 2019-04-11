package com.class11;

public class LargestAg {
   public static void main(String[] args) {
	
	// create an array of integers and find largest number 
	
	int[] numbers= {34,6,18,66,27,415,118,79,21,45};
	
	int largest=numbers[0];
	
	for (int i=0; i<numbers.length; i++) {
		 
		if (numbers[i]>largest)  {
			largest=numbers[i];
	    }
	}
	System.out.println("The largest number is "+largest);   
	
	
 }
}
