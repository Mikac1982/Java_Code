package com.class14;

public class ReverseString {
   public static void main(String[] args) {
	
  // INTERVIW QUESTION!!!!!
 	   
  // Reverse a String without using a reverse function   
	 
	   // first-- using toCharArray(); 
	   
	String original="Today is Java Class";
	String reverse="";       //creating a new string
	
	char[] array=original.toCharArray();  
	   
	 for (int i=array.length-1; i>=0; i--)  {
		 reverse=reverse+array[i];     // ""+"s"
	 }
	   
	 System.out.println("Reversed string is: "+reverse);  
	
	 // 2. using charAt();
	 
	 String reverse1="";
	 
	 for (int i=original.length()-1; i>=0; i--) {
		 reverse1=reverse1+original.charAt(i);
	 }
	 System.out.println("Reversed string is: "+reverse1);  
	 
	 // 3. using SUBSTRING();
	 
	 String reverse2="";
//	 System.out.println(original.length());  // 19
	 
	 for (int i=original.length(); i>0; i--) {
		 reverse2+=original.substring(i-1,i);
	 }
	 System.out.println("Reversed string is: "+reverse2);  
 }   
}
