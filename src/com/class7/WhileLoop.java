package com.class7;

public class WhileLoop {
  public static void main(String[] args) {
	
	 int a=1;
	 
	 while (a<10) {
		
		 a++;   // always increment
		 System.out.println("g mor");
	 }
	 int b=1;  // declare where it starts
	 
	 while (b<=5) {  //declare where it ends
		 System.out.println("I am inside while loop "+b);
		 b++;  // adding controller
	 }
	 System.out.println("I am outside of while loop");
	 
	 // i want to print values from 10 to 20
	 
	 int z=10;  
	 
	 while (z<=20) {   //providing the condition (true or false)
		 System.out.println(z);
		 z++;
	 }
	// I want tp print values from 1 to 20 inclusive but all in 1 line with space;
	 
	 int q=1;
	 
	 while (q<=20) {
		 System.out.print(q+" "); //in one line
		 q++; 
		 }
	 System.out.println("----------");
	 
	// i want to print values from 10 to 1;
	 
	 int e=10;
	 while (e>=1) {
		 System.out.println(e);
		 e--;
	 }
}
  
}
