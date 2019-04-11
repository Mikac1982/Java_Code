package com.Practice;

public class RemoveSpecEl {
   public static void main(String[] args) {
	
  // Write a Java program to remove a specific element from an array      
	   
  int[] arr= {13,25,7,-44,89,3,106};
  
  int a=-44;  //remove -44
  int[] arr1=new int[arr.length-1];
  
  System.out.println("An array after removing specific element -44:");
  
  for (int i=0; i<arr.length; i++) {
	  if (arr[i]!=a) {
		  
		  for (int y=0; y<arr.length-1; y++) {
			  arr1[y]=arr[i];
		  }
		  System.out.print(arr[i]+" ");
	  }
	 
  }

	   
}
}
