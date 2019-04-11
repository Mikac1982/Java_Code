package com.Practice;

import java.util.Arrays;

public class JavaArray1 {
   public static void main(String[] args) {
	
	 // Write a Java program to sort a numeric array and a string array
	   
	 int[] numbers= {111,29,3,43,5,67,8,9,77,6};  
	   
	 String[] names= {"Una","Nata","Dragana","Milica","Mika","Danilo"};
	 
	 System.out.println("Original numeric array: "+Arrays.toString(numbers));
	 Arrays.sort(numbers);
	 System.out.println("Sorted numeric varray: "+Arrays.toString(numbers));
	 
	 System.out.println();
	 
	 System.out.println("Original string array: "+Arrays.toString(names));
	 Arrays.sort(names);
	 System.out.println("Sorted string array: "+Arrays.toString(names));
}
}
