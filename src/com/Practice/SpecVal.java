package com.Practice;

public class SpecVal {
  public static void main(String[] args) {
	
	  // Write a Java program to test if an array contains a specific value (19)  
	  
	int[] num= {2,3,4,6,44,3,19,21,9,55};
	
	int specVal=19;
	boolean found=false;
	
	for (int i =0; i<num.length; i++)  {
		
		if (num[i]==19) {
			found=true;
			break;
		}	
	}
	if (found) {
		System.out.println("Specific value is found");  
	}else {
		System.out.println("Not found");
	}

	  
	  
	  
}
}
