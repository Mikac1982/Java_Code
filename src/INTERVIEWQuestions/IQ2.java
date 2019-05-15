package INTERVIEWQuestions;

import java.util.Arrays;

public class IQ2 {	  
  // Write a java program to find the second largest number in the array? 
  // Maximum and minimum number in the array?
	
	public static void main(String[] args) {
		
	//1. way using Arrays utility class
		
	int[] array= {204,2,-17, 271, 69, -64, 178};
	System.out.println("---------------Using Arrays Utility Class:");
	Arrays.parallelSort(array);
	System.out.println("Second largest: "+array[array.length-2]);
	System.out.println("Max: "+array[array.length-1]);
	System.out.println("Min: "+array[0]);	
		
	//2. more efficient way	
	
	int max=array[0];
	int secondMax=0;
	int min=0;
	
	System.out.println("---------------Using For Loop:");
	for (int i=0; i<array.length; i++)	{
		if (array[i]>max) {
			secondMax=max;
			max=array[i];
		}else if (array[i]>secondMax && array[i]!=max) {
			secondMax=array[i];
		}else if(array[i]<min) {
			min=array[i];
		}
	}
	System.out.println("SecondMax: "+secondMax);
	System.out.println("Max: "+max);	
	System.out.println("Min: "+min);	
	
	System.out.println("---------------Using Advanced For Loop:");
	
	for (int num : array) {
		if (num<min) {
			min=num;
		}else if (num>max) {
			secondMax=max;
			max=num;
		}
	}
	for (int num:array) {
	     if (num>secondMax && num<max) {
		     secondMax=num;
	}
	
	}
	
	System.out.println("SecondMax: "+secondMax);
	System.out.println("Max: "+max);	
	System.out.println("Min: "+min);
	
	}
}
