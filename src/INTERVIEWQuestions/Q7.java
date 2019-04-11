package INTERVIEWQuestions;

import java.util.Scanner;

public class Q7 {
   public static void main(String[] args) {
	
	// 7. Write a java program to check whether a given number is prime or not?     
	// Prime number should meet 2 conditions: divisible by 1 and by itself ONLY!
	// 2,3,4,7,11,13,17,19,23,29,31,37     
	
	int num;
	boolean prime=true;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Plese enter a number to check if it is a prime");
	num=scan.nextInt();
	
	for (int i=2; i<num; i++) {
		
		if (num%i==0) {
			prime=false;
			break;
		}
	}
	if (prime) {
		System.out.println(num+" is a prime number");  
	}else {
		System.out.println(num+" is NOT a prime number");  	
	}   
	   
}
}
