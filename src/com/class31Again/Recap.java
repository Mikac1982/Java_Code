package com.class31Again;

import java.util.ArrayList;

public class Recap {

	public static void main(String[] args) {
		//Variables - can store just 1 value inside 1 variable 
		int a=10;
		int b=20;
		int c=30;
		
		//Arrays - stores only values of the same type(homogeneous); fixed in size
		int[] array= {10,20,30, 10,20,30};
		
		//Generic ArrayList -storing only homogeneous values that belong to the same Integer class
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12); //method comes from parent, collection
		numbers.add(0, 13); //we want to add value 13 at the index 0 -method specific just for List(based on index)
		System.out.println(numbers);        // [13, 12]
		System.out.println(numbers.size()); //2
		numbers.add(0, 14);
		
		System.out.println(numbers.get(0)); //14 //get specific elemnt based on index
		System.out.println(numbers.get(1)); //13
		System.out.println(numbers.get(2)); //12
		
		numbers.set(1, 55); //to replaces values
		System.out.println(numbers);  // [14, 55, 12]
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1)); //33
		
		System.out.println(numbers.contains(33));  //true- (object with value 33 is there)
		System.out.println(numbers.contains(23));  //false (object with value 23 is NOT there)
		
		
		
		
		
		
	}
}
