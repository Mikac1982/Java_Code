package com.Practice;

public class JavaArray10and17 {
   public static void main(String[] args) {
	
	// Write a Java program to find the maximum and minimum value of an array.   
	// Find the second largest!
	   
	int[] arr= {233,5,187,-6,299,87,-56,77};
	
	int largest=0;
	int secondLar=0;
	int min=0;
	
	for (int a : arr) {
		if (a<min) {
			min=a;
		}else if (a>largest) {
			secondLar=largest;
			largest=a;
		}else if (a>secondLar) {
			secondLar=a;
		}
	}
	System.out.println("Minimum number: "+min);   
	System.out.println("Maximum number: "+largest);   
	System.out.println("Second largest number: "+secondLar);   
	   
}
}
