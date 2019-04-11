package com.class8;

public class ContinueAgain {
   public static void main(String[] args) {
	
	   for (int i=0; i<=6; i++) {
		   
		   if (i==3) {
			   continue;   // skip this code and jump to next one
		   }
		   System.out.println(i);
	       System.out.println("Hi");
	   }
	   System.out.println("Hello");
	   
	   for (int i=0; i<=10; i++) {
		   
		   if (i==2 || i==3) {
		   continue;
		   }
		   System.out.println(i);
		   System.out.println("Hiii");
	   }
	   // i want to print numbers from 1 to 20 but skip those divisible by 3
	   
	   for (int i=1; i<=20; i++) {
		   if (i%3==0) {
			   continue;
		   }
		   System.out.print(i+" ");
	   }
}
}
