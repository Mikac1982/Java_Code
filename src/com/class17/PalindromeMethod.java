package com.class17;

import java.util.Scanner;

public class PalindromeMethod {
 
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	//Create a method that will take a number and prints whether the number is even or odd.
	//Create a method that will print whether given String is palindrome or not.
	
	public static void main(String[] args) {
	
		PalindromeMethod obj=new PalindromeMethod();
		obj.isLarger(33, 68);
		obj.evenOrOdd(77);   //77 is ARGUMENT (value that is passed to the method when is called)
		obj.isPalindrome("was it a car or a cat i saw");
	}
	
	void isLarger(int a,int b) {
		
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
	}
	
	void evenOrOdd (int num) {
		
		if (num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
	}
	void isPalindrome(String str) {
		String reverse="";

		for (int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("String -"+str+"-is palindrome");
		}else {
			System.out.println("String -"+str+"-is not palindrome");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
