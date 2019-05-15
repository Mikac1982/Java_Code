package com.class14;

public class IntQ5 {
   public static void main(String[] args) {
	
	//5. Write a java program to reverse String? Reverse a string word by word?
	   
	   String str="Everything is going to be fine";  
	  
	       // using toCharArray();
	   
	   char[] array=str.toCharArray();
	   
	   for (int i=str.length()-1; i>=0; i--)  {
		  System.out.print(array[i]);
	   }
	   System.out.println();
	   
	        // using charAt();
	   
	   for (int i=str.length()-1; i>=0; i--) {
		   System.out.print(str.charAt(i));
	   }
	   System.out.println();
	   
	       // using substring();
	   
	   for (int i=str.length(); i>0; i--) {
		   System.out.print(str.substring(i-1,i));
	   }
	   System.out.println();
	   
	   //Reverse a string word by word:
	   // fine! be to going is Everything
	   
	  String[] arr=str.split(" ");
	  
      for (String word:arr) {
    	 System.out.print(word+" ");
      }
      System.out.println();
      System.out.println("Reversed string word by word:");
      
	  for (int i=arr.length-1; i>=0; i--) {
		 System.out.println(arr[i]);
	  }
	  
	   
	   
}
}
