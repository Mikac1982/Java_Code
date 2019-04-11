package com.class10;

public class ArraysIntro {
   public static void main(String[] args) {
	
	  int num=10;
	  num=10;  // int num=10;
	  
	int[] array1;       // declare an array (of intiger) --> preferred way!
	int [] array2;      // declare an array 
	int array3 [];      // declare an array 
	
	array1=new int[4];   // initialize, create an array!(4 is SIZE of array, how many values!)
	
	// assigning values:
	array1[0]=10;
	array1[1]=20;   
	array1[2]=30;
	array1[3]=40;       // we store 4 values of intiger!
	
	// access values:
	System.out.println(array1[3]);   //40
	
	// declaring array using one step! (line 9 and 13 together!)
    int[] numbers=new int[3];   // creating an object (array of intigers)
	
	numbers[0]=5;
	numbers[1]=10;
	numbers[2]=15;
//	numbers[3]=20;  // no error during compilation but error during run time
	                // ArrayIndexoutOfBoundsExpecetiopn -we are trying to access something that is out of our limit!
	
	System.out.println(numbers[1]);             //10
	System.out.println(numbers[0]+numbers[2]);  //20
	System.out.println(numbers[2]/numbers[0]);  //3
	
    String[] a=new String[3];  // declaring array of String
    a[0]="Hello";
    a[1]="Hi";                 // assigning values
    a[2]="Bye";
    
    System.out.println(a[1]+" friends");  //access values
    
 }
}