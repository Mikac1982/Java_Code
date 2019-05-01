package com.class30Again;

public class CollectionConcept {

	public static void main(String[] args) {
		
	    int a=10;
	    int b=20;
	    int c=30;
	
	    int[] array= {10,20,30,40};
	    int[] intArray=new int[3]; //size of an array =3
	    intArray[0]=10;
	    intArray[1]=20;
	    intArray[2]=30;
	//  intArray[3]=40; //during execution we will get run time error-ArrayIndexOutOfBoundsException
		
	    System.out.println(intArray[2]); //30
	    
	    int num=intArray[2];
	    System.out.println(num); //same 30
	    
	    //For Loop
	    for (int i=0; i<intArray.length; i++) {
	    	System.out.println(intArray[i]); //iterations 
	    }
	    //Advanced Loop
	    for (int number : intArray) {
	    	System.out.println(number); //printing each element from an array
	    }
	    
	    
	    
	    
	    
	}
}
