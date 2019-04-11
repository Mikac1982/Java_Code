package com.Practice;

public class Methods1234 {

	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	//Create a method that will take a number and prints whether the number is even or odd.
	//Create a method that will print whether given String is palindrome or not.
	//Create a method that will check whether a given number is prime or not.

	
	public static void main(String[] args) {
		
		Methods1234 obj=new Methods1234();
		obj.isLarger(56, 82);
		obj.evenOrOdd(792);
		obj.isPalindrome("madaM");
		obj.isPrime(23);  
		obj.Fibanocci();
		
	}
	
	void isLarger(int a,int b) {
		
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
	}
	
	void evenOrOdd(int num) {
		
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
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("String "+str+" is palindrome");
		}else {
			System.out.println("String "+str+" is not palindrome");
		}
	}
	
	void isPrime(int num) {
		boolean Prime=true;
		
		for (int i=2; i<num; i++) {
			if (num%i==0) {
			Prime=false;
			break;
			}
		}
		if (Prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
	
	void Fibanocci() {

		int a=0;
		int b=1;
		int c=a+b;
		System.out.print(a+" "+b+" ");
		
		for (int i=2; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
	
	
}
