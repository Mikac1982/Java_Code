package JavaInterviewQuestions;

import java.util.Arrays;

public class IQ2_ {
	// Write a java program to find the second largest number in the array?
    // Maximum and minimum number in the array?	  
	
	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		//1.easiest way -using Arrays (utility class)
		int[] array= {4,65,-15,316,2,226,0,-8};
		
		System.out.println("---------------Using Arrays Utility Class:");
			
		Arrays.parallelSort(array);
		System.out.println("The second largest num: "+array[array.length-2]);
		
		//2. more efficient way
		int largest=array[0];
		int secondLar=0;
		
		System.out.println("---------------Using Advanced For Loop:");
		for (int num:array) {
			if (num>largest) {
				secondLar=largest;
				largest=num;
			}else if(num>secondLar) {
				secondLar=num;
			}
		}
		System.out.println("The largest num: "+largest);
		System.out.println("The second largest num: "+secondLar);
		
		System.out.println("---------------Using For Loop:");
		for (int i=0; i<array.length; i++) {
			if (array[i]>largest) {
				secondLar=largest;
				largest=array[i];
				
			}else if(array[i]>secondLar && array[i]!=largest) {
				secondLar=array[i];
			}
		}
		System.out.println("The largest num: "+largest);
		System.out.println("The second largest num: "+secondLar);
		
		System.out.println();
		
	 // Maximum and minimum number in the array?	  	
	 //1. easiest way 	
		
		int[] array2= {4,65,-15,316,2,226,0,-8};
		System.out.println("---------------Using Arrays Utility Class:");
		Arrays.parallelSort(array2);  //sorting numbers from minimum to maximum
		int min=array2[0];  //minimm nuber is the first one with index 0
		int max=array2[array2.length-1]; //the largest number is the last in the array
		
		System.out.println("Max num is: "+max);
		System.out.println("Min num is: "+min);
		
	//2. more efficient way	
		System.out.println("---------------Using Advanced For Loop:");
		for (int num:array2) {
			if (num>max) {
				max=num;
			}else if (num<min) {
				min=num;
			}
		}
		System.out.println("Max num is: "+max);
		System.out.println("Min num is: "+min);
		
		System.out.println("---------------Using For Loop:");
		
		for (int i=0; i<array2.length; i++) {
			if (array2[i]>max) {
				max=array2[i];
			}else if (array2[i]<min) {
				min=array2[i];
			}
		}
		System.out.println("Max num is: "+max);
		System.out.println("Min num is: "+min);
		
	}
}
