package com.class19;

public class Minimum {

	/*Create a class Called Minimum
	 * with in it crate a method called minOfValues; make it static
	 * From your previous Applicaions class call the method and pass an array argument
	 * and prin out the result
	 */
	
	
	static int minOfValues(int[] arr) {
		
		int min=arr[0]; //value more than 0
		
		for (int a:arr) {
			if (a<min) {
			  min=a;
		    }
		}
	//System.out.println("Minimummin value is "+min);
	   return min;
	}
	  
	void maxOfValues()	{
		
		
	}	
	
	  
}
