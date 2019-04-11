package com.class14;

public class TaskReplaceSplit {
   public static void main(String[] args) {
/*
	1.Create a String that will hold a sentence.
	  Write a program to get a new String without any spaces.

    2.Create a String that should be combination of letters, numbers and special characters.
      Find out how many alpha characters are there in the String.

    3.You have a String a=“Is it Saturday! Is it raining! Do we have a Java Class today?”
      How would you find out how many sentences are in that String?
	*/
 //1.   
	 String str="Everything is going to be fine";
	 
	 System.out.println(str);
	 System.out.println(str.replace(" ", ""));
	
	 System.out.println();
 //2. 
	 String str1="Today is: March 30th 2019!";
	 
	 String newString=str1.replaceAll("[^a-zA-Z]", "");
	 System.out.println("There are "+newString.length()+" alpha characters in the String");
	 
	 System.out.println();
 //3. 
	 String str2="Is it Saturday? Is it raining? Do we have a Java Class today?";
	 
	 String[] array=str2.split("\\?");
	 
	 for (String substring:array) {
		 System.out.println(substring);
	 }
	 System.out.println("There are "+array.length+" sentences in the String");
}
}
