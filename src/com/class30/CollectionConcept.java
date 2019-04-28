package com.class30;

public class CollectionConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int[] array= {10,20,30, 40};
		int[] intArray=new int[3]; //size of an array=3
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
	//	intArray[3]=40; ArrayIndexOfBoundsException: 3
		
		System.out.println(intArray[2]);  //30
		
		int num=intArray[2];
		System.out.println(num); //30
		
		
		for (int i=0; i<intArray.length; i++) { //for loop
			System.out.println(intArray[i]);
		}
		
		for (int number:intArray) {   //advanced loop
			System.out.println(number);
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
