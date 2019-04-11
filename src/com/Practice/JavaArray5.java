package com.Practice;

public class JavaArray5 {
   public static void main(String[] args) {
	
	 // Write a Java program to test if an array contains a specific value (19)
	    
	   int[] array= {2,10,30,5,6,19,8,15,44,33};  
	   boolean found=false;
	   
	   int num=19;
	   
	   for (int i=0; i<array.length; i++)  {
		   
		   if (array[i]==19) {
			  found=true;
			  break;
		   }
	   }
	   if (found) {
		   System.out.println("The array contains specific value 19");
	   }else {
		   System.out.println("The array do not contains specific value 19");
	   }
	   
}
}
