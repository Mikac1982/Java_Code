package com.Practice;

public class IndexOfArrElem {
   public static void main(String[] args) {
	
	int[] arr= {32,6,1,77,31,482,9,77};
	
	int a=31;
	
	for (int i=0; i<arr.length; i++)  {
		if (arr[i]==a) {
	    System.out.println("The index of an array element 31 is "+i);
	}   
	}   
}
}
