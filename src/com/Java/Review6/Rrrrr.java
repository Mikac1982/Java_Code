package com.Java.Review6;

public class Rrrrr {
   public static void main(String[] args) {
	
	   /**
	       * Write a program that:
	       *1 Converts all the characters in the string to lower case and prints.
	       *2 Converts all the characters in the string to upper case and prints.
	       *3 Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
	       *4 Counts the number of letter 'a' in the string/paragraph and prints.
	       *5 Prints the second half of the string/paragraph.
	       *6 Prints characters between the 10th and 20th indices(inclusive).
	       *7 Prints the string/Paragraph in reverse order.
	       *8 Clears/removes all white spaces or tabs on both ends and prints.
	       */

	      String para = "The quick brown fox jumps over the lazy dog.";    
	 //1
	      System.out.println(para.toLowerCase());
	 //2 
	      System.out.println(para.toUpperCase());
	 //3
	      System.out.println(para.startsWith("The"));
	      System.out.println(para.endsWith("The"));
	 //4 
	      int count=0;
	      for (int i=0; i<para.length(); i++)  {
	    	  if (para.charAt(i)=='a') {
	    		  count++;
	    	  }
	      }
	      System.out.println(count);
	  //5
	      System.out.println(para.substring(para.length()/2));
	  //6  
	      System.out.println(para.substring(10,20));
	  //7
	     for (int i=para.length()-1; i>=0; i--) {
	    	 System.out.print(para.charAt(i));
	     } 
	     System.out.println();
	  //8 
	     System.out.println(para.trim());
}
}
