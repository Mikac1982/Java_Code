package JavaInterviewQuestions;

import java.util.Arrays;

public class IQ2 {
	// Write a java program to find the second largest number in the array?
	// Maximum and minimum number in the array?	  
	
	public static void main(String[] args) {
		
	int[] array= {93,72,-3,116,84,5,23};
	
	//second largest number 
	//1.easiest way
	Arrays.sort(array);
	System.out.println(array[array.length-2]);
	
	int largest=array[0];
	int secLargest=0;
	int minimum=0;
	
	for (int a:array) {
		
		if (a<minimum) {
			minimum=a;
		
		}else if (a>largest) {
			secLargest=largest;
			largest=a;
		}else if(a>secLargest){
			secLargest=a;
		}
		
	}
	System.out.println("Secon largest number is: "+secLargest);
	System.out.println("The largest number is :"+largest);	
	System.out.println("Minimum number is "+minimum);	
		
	}
}
