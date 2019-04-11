package com.class12;

public class Recap {
    public static void main(String[] args) {
		
    int[][] arr= {
    		{1,2,3},         // first array stored with index 0 (first row)
    		{10,20,30},      // second array with index 1
    		{100,200,300}    // third array with index 2
    };
	
	for (int i=0; i<arr.length; i++) {  //how many total arrays inside my big(2D) array -->3
		
		for (int y=0; y<arr[i].length; y++)  {   
			System.out.print(arr[i][y]+" ");  //0 //1 //2
		}
		System.out.println();  //after we finish iteration of first array go to new line
	}
	
	System.out.println("----------For each loop---------");
	
	// loop true each element inside 2D Array__ each element=array
	for (int[] singleArray:arr)  {  // trying to look true 2D array, that's why we have []
		// loop true each single array
		for (int numbers:singleArray)  {   // {1,2,3}
			System.out.print(numbers+" ");
		}
		System.out.println();
	}
	
	
	
    }	
}
