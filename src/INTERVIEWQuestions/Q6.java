package INTERVIEWQuestions;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
		
   // Write a Java Program to find whether a String is palindrome or not? 	
   
   String str;
   
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter string to check if it is a palindrome");
   str=scan.nextLine();	
   
   String reverse="";
   
   for (int i=str.length()-1; i>=0; i--) {
	   reverse+=str.charAt(i);
   }
   System.out.println(reverse);
   
   if (reverse.equalsIgnoreCase(str))	{
    	System.out.println("String is palindrome");
   }else {
    	System.out.println("String is not palindrome");
   }
    
  }
}
