package com.Practice;

public class JavaArray8 {
   public static void main(String[] args) {
	
	//   Write a Java program to copy an array by iterating the array  
	   
	 int[] num= {2,4,6,8,10};
	 int[] num1=new int[num.length];  // we create new array with a same size
	 
	 for (int i=0; i<num.length; i++)  {
		num1[i]=num[i]; 
		
		System.out.print(num1[i]+" ");
	 }
	
	
}
}
