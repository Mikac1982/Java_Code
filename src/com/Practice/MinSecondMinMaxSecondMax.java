package com.Practice;

public class MinSecondMinMaxSecondMax {
  public static void main(String[] args) {
	
  // Write a Java program to find out minimum,second minimum,maximum and second maximum number of an array. 	  
	    
	int[] arr= {99,-95,14,-153,453,104,1,144};
	
	int min=arr[0];
	int secondMin=0;
	int max=arr[0];
	int secondMax=0;
	
	for (int a:arr)  {
		
		if ( a<min) {
			secondMin=min;
			min=a;
		}else if (a>max) {
			secondMax=max;
			max=a;
		}else if (a<secondMin) {
			secondMin=a;
		}else if (a>secondMax) {
			secondMax=a;
		}
	}
	
//	for (int a : arr) {
//		if (a<secondMin && a>min) {
//			secondMin=a;
//		}
//	}
	
	System.out.println("Minimu        :"+min);  
	System.out.println("Second Minimum:"+secondMin);  
	System.out.println("Maximum       :"+max);
	System.out.println("Second Max    :"+secondMax);
}
}
